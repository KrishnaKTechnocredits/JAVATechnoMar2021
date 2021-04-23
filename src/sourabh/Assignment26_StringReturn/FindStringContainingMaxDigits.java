/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/
package sourabh.Assignment26_StringReturn;

public class FindStringContainingMaxDigits {
	String getStringContainingMaxDigits(String[] strInput) {
		//String[] strOutput = new String[5];
		int maxDigit=0;
		String maxString="";
		int count=0;
		for(int index=0; index<strInput.length; index++) {
			String strOutput= strInput[index];
			for(int index1=0; index1<strInput[index].length();index1++) {
				char checkChar=strInput[index].charAt(index1);
				if(Character.isDigit(checkChar))
					count++;
				
			}
		
		if(maxDigit<count)
			maxDigit=count;
			maxString=strOutput;
		}
		return maxString;
	}
	public static void main(String[] args) {
		FindStringContainingMaxDigits findStringContainingMaxDigits= new FindStringContainingMaxDigits();
		
		String[] strInput = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		String strOutput = findStringContainingMaxDigits.getStringContainingMaxDigits(strInput);
				System.out.println(strOutput);
		
	}

}
