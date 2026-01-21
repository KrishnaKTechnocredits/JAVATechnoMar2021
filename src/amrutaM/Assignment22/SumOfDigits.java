package amrutaM.Assignment22;

/*Program 2 :
Find sum of all the digits in a given string 
String str = "Te11ch2no3cr4edi2ts"  
output : 13
*/
public class SumOfDigits {

	void getSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		System.out.println("Sum of digits in the string is "+sum);
	}

	public static void main(String[] args) {
		String str = "Te11ch2no3cr4edi2ts";
		new SumOfDigits().getSum(str);
	}
}
