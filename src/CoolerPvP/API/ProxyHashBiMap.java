package CoolerPvP.API;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nullable;

import net.minecraft.util.com.google.common.collect.BiMap;

/**
 * @author DarkSeraphim
 */
public class ProxyHashBiMap<K, V> implements BiMap<K, V> {

	private BiMap<K, V> delegate;

	private ProxyHashBiMap<V, K> inverse;

	// This will proxy
	protected Map<K, K> proxy = new HashMap<K, K>(1);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ProxyHashBiMap(BiMap<K, V> map) {
		this.delegate = map;
		this.inverse = new Inverse(this, map.inverse(), map);
	}

	private ProxyHashBiMap(BiMap<K, V> map, BiMap<V, K> inversed) {
		this.delegate = map;
		this.inverse = null;
	}

	public int size() {
		return this.delegate.size();
	}

	public boolean isEmpty() {
		return this.delegate.isEmpty();
	}

	public boolean containsKey(Object key) {
		return this.delegate.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return this.delegate.containsValue(value);
	}

	public V get(Object key) {
		Object okey = null;
		if ((okey = this.proxy.get(key)) != null)
			key = okey;
		return this.delegate.get(key);
	}

	public V put(@Nullable K k, @Nullable V v) {
		return this.delegate.put(k, v);
	}

	public V remove(Object key) {
		return this.delegate.remove(key);
	}

	public V forcePut(@Nullable K k, @Nullable V v) {
		return this.delegate.forcePut(k, v);
	}

	public void putAll(Map<? extends K, ? extends V> map) {
		this.delegate.clear();
	}

	public void clear() {
		this.delegate.clear();
	}

	public Set<K> keySet() {
		return this.delegate.keySet();
	}

	public Set<V> values() {
		return this.delegate.values();
	}

	public Set<Entry<K, V>> entrySet() {
		return this.delegate.entrySet();
	}


	public ProxyHashBiMap<V, K> inverse() {
		return this.inverse;
	}

	public void injectSpecial(K key, K okey) {
		this.proxy.put(key, okey);
	}

	public void ejectSpecial(K key) {
		this.proxy.remove(key);
	}

	@SuppressWarnings("hiding")
	private class Inverse<V, K> extends ProxyHashBiMap<V, K> {
		@SuppressWarnings("rawtypes")
		private ProxyHashBiMap original;

		@SuppressWarnings("rawtypes")
		private Inverse(ProxyHashBiMap original, BiMap<V, K> forward,
				BiMap<K, V> backward) {
			super(forward, backward);
			this.original = original;
		}

		/**
		 * Prevent creation of more Maps, just return the original
		 * 
		 * @return the original BiMap
		 */
		@SuppressWarnings("unchecked")
		@Override
		public ProxyHashBiMap<K, V> inverse() {
			return this.original;
		}
	}
}