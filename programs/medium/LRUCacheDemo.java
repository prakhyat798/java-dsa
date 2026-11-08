import java.util.*;

public class LRUCacheDemo {
    static class LRUCache extends LinkedHashMap<Integer, Integer> {
        private final int capacity;

        LRUCache(int capacity) {
            super(16, 0.75f, true);
            if (capacity < 1) throw new IllegalArgumentException("Capacity must be positive");
            this.capacity = capacity;
        }

        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }

        int read(int key) { return getOrDefault(key, -1); }
        void save(int key, int value) { put(key, value); }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.save(1, 10);
        cache.save(2, 20);
        System.out.println(cache.read(1));
        cache.save(3, 30);
        System.out.println(cache.read(2)); // evicted
    }
}
