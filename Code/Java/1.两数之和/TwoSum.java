import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	 public static void main(String[] args) {
        // System.out.println("Hello World\n");

   		TwoSum ts = new TwoSum();
   		int[] nums = {2, 7, 11, 15};
   		int[] result = ts.twoSum(nums, 9);

   		for (int n: result) {
   			System.out.println(n);
   		}

  	}

  	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        	
        	int temp = target - nums[i];
        	if (map.containsKey(temp)) {
        		return new int[] {map.get(temp), i};
        	}
        	map.put(nums[i], i);
        }
        return new int[0];
    }

}