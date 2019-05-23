public class palindromenumber {
	 public static void main(String[] args)
    {
        // System.out.println("Hello World\n");

        System.out.println(isPalindrome(122221));
    }
	public static boolean isPalindrome(int x) {
        
        // 题干得 负数回文后 负号在后面，不成立
        // 如果最后一位0，第一位也应该为0. 所以排除，但是 如果 x = 0，例外。
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false; 
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}


		// 如果 x 位数为奇数时，中间数反转后是不变的。所以可以直接忽略  x  = revertedNumber / 10
		// 如果 x 位数为偶数时，revertedNumber = x 跳出循环。

		return x == revertedNumber || x == revertedNumber / 10;

    }
}