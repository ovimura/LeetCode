package InsertDeleteGetRandom;

import java.util.*;

public class RandomizedSet {

    private Map<Integer, Integer> map;
    private List<Integer> items;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        items = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        else {
            int idx = items.size();
            items.add(val);
            map.put(val, idx);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int rem = map.get(val);
        int len = items.size()-1;
        int last = items.get(len);
        int a = items.get(rem);
        items.set(rem, items.get(len));
        items.set(len, a);
        map.put(last, rem);
        items.remove(len);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if(items.isEmpty())
            return 0;
        Random random = new Random();
        int idx = random.nextInt(items.size());
        return items.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

