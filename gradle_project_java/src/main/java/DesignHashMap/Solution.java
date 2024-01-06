package DesignHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static class MyHashMap {

        private int[] hm = null;

        public MyHashMap() {
            this.hm = new int[1000001];
            Arrays.fill(this.hm, -1);
        }

        public void put(int key, int value) {
            this.hm[key] = value;
        }

        public int get(int key) {
            return this.hm[key];
        }

        public void remove(int key) {
            this.hm[key] = -1;
        }
    }
}
