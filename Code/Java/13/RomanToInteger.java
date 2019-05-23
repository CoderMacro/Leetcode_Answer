import java.util.HashMap;
// import java.util.String;

class RomanToInteger {

  public static void main(String[] args) {
        // System.out.println("Hello World\n");

    System.out.println(romanToInt("IV"));
  }

   public static int romanToInt(String s) {

      int sum = 0;
      if (s.indexOf("IV") != -1 || s.indexOf("IX") != -1) {
          sum -= 2;
      }
      if (s.indexOf("XL") != -1 || s.indexOf("XC") != -1) {
          sum -= 20;
      }
      if (s.indexOf("CD") != -1 || s.indexOf("CM") != -1) {
          sum -= 200;
      }

      for (int i = 0; i < s.length(); i++) {
        Character c = s.charAt(i);
        if (c == 'I') {
          sum += 1;
        } else if (c == 'V') {
          sum += 5;
        } else if (c == 'X') {
          sum += 10;
        } else if (c == 'L') {
          sum += 50;
        } else if (c == 'C') {
          sum += 100;
        } else if (c == 'D') {
          sum += 500;
        } else if (c == 'M') {
          sum += 1000;
        }
      }
      return sum;

   }

    /*
	字符          数值
	I             1			73
	V             5			86
	X             10		88
	L             50		76
	C             100		67
	D             500		68
	M             1000		77
    */
  public static int romanToInt2(String s) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int sum = 0;
    int last = -1;
    for (int i = 0; i < s.length(); i++) {
      int num = map.get(s.charAt(s.length() - 1 - i));
      if (num < last) {
        System.out.println(num);
        sum -= num;
      } else {
        System.out.println(num);
        sum += num;
      }
      last = num;
    }
    return sum;
  }
}