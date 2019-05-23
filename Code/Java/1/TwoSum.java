import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class TwoSum {

   public static void main(String[] args) {

      int[] nums = {2, 7, 11, 15};
      int[] result = new TwoSum().twoSum(nums, 9);
      System.out.println(Arrays.toString(result));
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