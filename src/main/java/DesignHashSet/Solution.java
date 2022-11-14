package DesignHashSet;

public class Solution {
    public static class MyHashSet {
        int [] hs = null;
        public MyHashSet() {
            this.hs = new int[1000001];
        }

        public void add(int key) {
            this.hs[key] = 1;
        }

        public void remove(int key) {
            this.hs[key] = 0;
        }

        public boolean contains(int key) {
            if(this.hs[key] != 0) {
                return true;
            } else
                return false;
        }
    }
}
