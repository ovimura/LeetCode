package TopKFrequentElements;

import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: nums) {
            if(!map.keySet().contains(n)) {
                map.put(n, 1);
            } else {
                int v = map.get(n) +1;
                map.put(n, v);
            }
        }
        int[] temp = new int[k];
        Map<Integer, Integer> sortedByCount = map.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (int i=0; i<k; i++) {
            temp[i] = (int)sortedByCount.keySet().toArray()[i];
        }
        return temp;
    }

    public int[] topKFrequent1(int[] nums, int k) {
            // build hash map : character and how often it appears
            HashMap<Integer, Integer> count = new HashMap();
            for (int n: nums) {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }

            // init heap 'the less frequent element first'
            PriorityQueue<Integer> heap =
                    new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

            // keep k top frequent elements in the heap
            for (int n: count.keySet()) {
                heap.add(n);
                if (heap.size() > k)
                    heap.poll();
            }

            // build output list
            List<Integer> top_k = new LinkedList();
            while (!heap.isEmpty())
                top_k.add(heap.poll());
            Collections.reverse(top_k);
            int[] ints = new int[top_k.size()];
            for(int i=0; i<ints.length; i++) {
                ints[i] = (int)top_k.toArray()[i];
            }
            return ints;
    }
}
