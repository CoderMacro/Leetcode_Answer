public class reverseinteger
{
    public static void main(String[] args)
    {
        // System.out.println("Hello World\n");

        System.out.println(reverse(214783647));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    public static int reverse(int x) {

    	int reverse = 0;
    	while(x != 0) {
    		int pop = x % 10;
    		x /= 10;
    		if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
    			return 0;
    		}
    		if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10)) {
    			return 0;
    		}
    		reverse = reverse * 10 + pop;
    	}
    	return reverse;
    }
}