package amazonInterview;

import AmazonInterview.Solution1;
import org.junit.Test;

import java.util.List;

public class Solution1Test {
    @Test
    public void test1() {
        Solution1 s = new Solution1();
        int[] arr = new int[]{1,0,0,0,0,1,0,0};
        List<Integer> list = s.cellCompete(arr, 1);
        list.forEach(n -> {
            System.out.print(n + " ");
        });
    }


    @Test
    public void test2() {
        Solution1 s = new Solution1();
        int[] arr = new int[]{1,1,1,0,1,1,1,1};
        List<Integer> list = s.cellCompete(arr, 2);
        list.forEach(n -> {
            System.out.print(n + " ");
        });
    }

}
