public class PlusOne {

    public static void main(String[] args) {
          
            int[] nums = {9};
            int[] digits = plusOne(nums);
            for (int n : digits) {
            	System.out.println(n);
            }
            
    }

    public static int[] plusOne(int[] digits) {
        
    	int idx = digits.length - 1;
    	while (idx >= 0) {

    		if (digits[idx] == 9) {
    			digits[idx] = 0;
    		} else {
    			digits[idx] = digits[idx] + 1;
    			break;
    		}
    		idx --;
    	}
    	if (digits[0] == 0) { 
    		digits = new int[digits.length + 1];
    		digits[0] = 1;
    	}
    	return digits;
    }

}