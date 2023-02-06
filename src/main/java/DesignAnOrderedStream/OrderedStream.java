package DesignAnOrderedStream;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    private int idx;
    private String[] temp;

    public OrderedStream(int n) {
        this.idx = 1;
        this.temp = new String[n+1];
    }

    public List<String> insert(int idKey, String value) {
        this.temp[idKey] = value;
        List<String> r = new ArrayList<>();
        while(this.idx<this.temp.length && this.temp[this.idx] != null) {
            r.add(this.temp[this.idx]);
            this.idx++;
        }
        return r;
    }

    public void print() {
        for(int i=0; i<this.temp.length; i++) {
            System.out.print(this.temp[i] + ".");
        }
        System.out.println();
    }
}
