import java.util.Arrays;

public class OpsOnArray {

	public static int[] solve1(int[] nums) {
	    int n = nums.length;
	    for (int i = 0; i < n - 1; i++) {
	        if (nums[i] == nums[i + 1]) {
	            nums[i] *= 2;
	            nums[i + 1] = 0;
	        }
	    }
	    int j = 0;
	    for (int i = 0; i < n; i++) {
	        if (nums[i] != 0) {
	            nums[j] = nums[i];
	            j++;
	        }
	    }
	    while (j < n) {
	        nums[j] = 0;
	        j++;
	    }
	    return nums;
	}
	
	public static int[] solve(int[] nums) {
	    int n = nums.length;
	    for (int i = 0; i < n - 1; i++) {
	        if (nums[i] == nums[i + 1]) {
	            nums[i] *= 2;
	            nums[i + 1] = 0;
	        }
	    }
	    int j = 0;
	    for (int i = 0; i < n; i++) {
	        if (nums[i] != 0) {
	            nums[j] = nums[i];
	            j++;
	        }
	    }
	    while (j < n) {
	        nums[j] = 0;
	        j++;
	    }
	    return nums;
	}


	public static void main(String[] args) {
		System.out.println("Run Tests:");
		for(int i : solve(new int[] {1,2,2,1,1,3})) {
			System.out.println(i);
		}
		
//		if(!Arrays.equals(solve(new int[] {1,2,2,1,1,3}), new int[] {1,2,3,0,0,0}))
//			throw new RuntimeException("ERROR: Tests fail!!!");
//		else
//			System.out.println("Tests PASSED!");
	}

	
//    while (j < n) {
//    nums[j] = 0;
//    j++;
//}
}