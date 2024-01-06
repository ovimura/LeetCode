package LFUCache;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache {

    private int min;

    private final int capacity;
    // keyToVal stores the value of each put
    private final HashMap<Integer, Integer> keyToVal;
    // keyToCount stores access times
    private final HashMap<Integer, Integer> keyToCount;
    private final HashMap<Integer, LinkedHashSet<Integer>> countToLRUKeys;

    public LFUCache(int capacity) {
        this.min = -1;
        this.capacity = capacity;
        this.keyToVal = new HashMap<>();
        this.keyToCount = new HashMap<> ();
        this.countToLRUKeys = new HashMap<>();
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key)) return -1;

        int count = keyToCount.get(key);
        countToLRUKeys.get(count).remove(key); // remove key from current count (since we will inc count)
        // remove key from current count (since we will inc count)
        if (count == min && countToLRUKeys.get(count).size() == 0) min++; // nothing in the current min bucket
        // When there is nothing in the current minimum bucket, min++

        // Add and return the number , every get+1, access times +1
        putCount(key, count + 1);
        return keyToVal.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) return;

        if ( keyToVal.containsKey(key)) {
            keyToVal.put(key, value); //update key update key's value
            get(key); //update key's count update key's count
            return;
        }

        if (keyToVal.size() >= capacity)
            evict(countToLRUKeys.get(min).iterator().next()); // evict LRU from this min count bucket evict
        // the least frequently read from this minimum count bucket Element LRU

        min = 1; //min is recalculated as 1
        putCount(key, min); //adding new key and count add new key and count
        keyToVal.put(key, value); //adding new key and value add New key and value
    }

    // Delete
    private void evict(int key) {
        countToLRUKeys.get(min).remove(key);
        keyToVal.remove(key);
    }

    // Add to two maps count
    private void putCount(int key, int count) {
        keyToCount.put(key, count);
        countToLRUKeys.computeIfAbsent(count, ignore -> new LinkedHashSet<>());
        countToLRUKeys.get(count).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */