package ReplaceElementsWithGreatestElementOnRightSide;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int max = -1;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] > max)
                    max = arr[j];
            }
            res[i] = max;
        }
        return res;
    }

    public int[] replaceElementsLinear(int[] arr) {
        int length = arr.length;
        int i = length-1;
        int max = arr[i];
        arr[i] = -1;
        while(i>0){
            if(max<arr[--i]){
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            else{
                arr[i] = max;
            }

        }
        return arr;
    }
}
