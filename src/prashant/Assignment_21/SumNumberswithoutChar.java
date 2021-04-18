/*WAP to sum all the numbers in given string without using character class method
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/
package prashant.Assignment_21;

public class SumNumberswithoutChar {

	void sumnum(String str) {
		int digitCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digitCnt = digitCnt + Integer.valueOf(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println("sum all the numbers in given string without using character class method :" + digitCnt);
	}

	public static void main(String[] args) {
		SumNumberswithoutChar Count = new SumNumberswithoutChar();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		Count.sumnum(str);
	}
}