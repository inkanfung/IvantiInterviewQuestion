import java.util.*;

public class advancebinaryAdding{

public static String sum(String b1, String b2) {
	
	int len1 = b1.length();
    int len2 = b2.length();
    int carry = 0;
    String res = "";
	int maxLen = Math.max(len1, len2);
	
    // the final length of the result depends on the bigger length between b1
    // and b,
    // (also the value of carry, if carry = 1, add "1" at the head of result,
    // otherwise)
	// start from last char of String b1 and b2
      // notice that left side is an int and right side is char
      // so we need to minus the decimal value of '0'
	
    
    for (int i = 0; i < maxLen; i++) {

      int a = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0;
      int b = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
      int tmp = a + b + carry;
      carry = tmp / 2;
      res = tmp % 2 + res;
    }
    return (carry == 0) ? res : "1" + res;
  }
  
  public static void main(String[] args) {
	  
	 Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter first binary number");
    String firstbinaryNumber = scnr.nextLine();

    System.out.println("Please enter second binary number");
    String secondbinaryNumber = scnr.nextLine();

    String sum = sum(firstbinaryNumber, secondbinaryNumber);
    System.out.println("Sum of two binary number is : " + sum);

    scnr.close();

  }
}


