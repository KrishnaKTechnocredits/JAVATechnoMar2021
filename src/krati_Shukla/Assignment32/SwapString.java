//swap 2 String using temporary variable.
//swap 2 String without using temporary variable.

package krati_Shukla.Assignment32;

public class SwapString {
	
	void SwapTemp(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("String#1 is: "+str1+" String#2 is: "+str2);
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
	}
	
	void SwapWithoutTemp(String str1, String str2) {
		int length1 = str1.length();
		
		String temp = str1+str2;
		str2 = temp.substring(0,length1);
		str1 = temp.substring(length1);
		System.out.println("String#1 is: "+str1);
		System.out.println("String#2 is: "+str2);
		
	}

	public static void main(String[] a) {
		SwapString swapString = new SwapString();
		swapString.SwapTemp("techno", "credits");
		swapString.SwapWithoutTemp("techno", "credits");
	}
}
