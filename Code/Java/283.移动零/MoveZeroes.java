public class MoveZeroes {

	public static void main(String[] args) {
          
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

            
    }

    public static void moveZeroes(int[] nums) {
        
        int length = nums.length;
        int fast = 0;
        int slow = 0;
        while (slow < length) {
            
            if (fast < length && nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            } 
            if (fast >= length) {
                nums[slow] = 0;
                slow++;
            }
            fast++;
        }

        for (int n : nums) {
        	System.out.println(n);
        }

    }

}