package prachi.Assignment_26;

/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/
 
public class StrContainsMaxDigits {

	String getStrContainsMaxDigits(String[] str) {
		
		String outputStringElement="";
		int maxDigits = 0;
		
		for (int index = 0; index < str.length; index++) {
			int count = 0;
			for (int str_1 = 0; str_1 < str[index].length(); str_1++) {
				if (Character.isDigit(str[index].charAt(str_1)))
					count++;
			}
			if (maxDigits < count) {
				maxDigits = count;
				outputStringElement = str[index];
			}
		}
		return outputStringElement;
	}

	public static void main(String[] args) {
		StrContainsMaxDigits maxStr = new StrContainsMaxDigits();
		String[] input = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		System.out.println("String having maximum digits is: ");
		System.out.println(maxStr.getStrContainsMaxDigits(input));
	}
}
