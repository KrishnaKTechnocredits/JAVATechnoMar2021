package gauravk.Assignment_26;
/*
 * After Lecture - 21_April_Session-29_Assingment_Solution Assignment - 26 : 19th April'2021
Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */
public class StringWithMaxDigitsFrmArray {
	public static void main(String[] a) {
		String [] arr = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		System.out.println("The string containing maximum digits from array set is "+new StringWithMaxDigitsFrmArray().maxDigitString(arr));
	}
	
	String maxDigitString(String [] arg) {
		int[] digitCount = new int[arg.length];
		int outIndex=0;
		for(int i=0; i<arg.length; i++) {
			String targetStr = arg[i];
			int counter=0;
			for(int innerI =0; innerI<targetStr.length(); innerI++) {
				if(Character.isDigit(targetStr.charAt(innerI))) {
					counter++;
				}
			}
			digitCount[i] = counter;
		}
		int max = 0;
		for(int i=0; i<digitCount.length; i++) {
			if(digitCount[i]> max) {
				max=digitCount[i];
				outIndex=i;
			}
		}
		return arg[outIndex];
	}
}