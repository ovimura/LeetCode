package UniqueNumberOfOccurrences;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] u = new int[2001];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < 0)
                u[-arr[i]]++;
            else if(arr[i] == 0)
                u[1000]++;
            else if(arr[i] > 0)
                u[1000+arr[i]]++;
        }
        for(int i=0; i<u.length; i++) {
            if(u[i]>0) {
                int count = 0;
                for(int j=0; j<u.length; j++) {
                    if(u[i] == u[j])
                        count++;
                }
                if(count != 1)
                    return false;
            }
        }
        return true;
    }
}
