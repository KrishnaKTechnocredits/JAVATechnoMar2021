/*Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

package krati_Jain.codingExam4;

public class StringPalindromeCode4 {
	
	public static void main(String[] args) {
		StringPalindromeCode4 strPalindrome = new StringPalindromeCode4();
		strPalindrome.stringToArray();
	}
	
	void stringToArray() {
		String inputStr = "Hi MAM hello NamaN techno";
		String[] input = inputStr.split(" ");
		for(int index =0; index < input.length; index ++) {
			//System.out.println(input[index]);
			processString(input[index]);
			
			
		}
	}
	
	void processString(String str) {
		StringBuffer strBuf1 = new StringBuffer(str);
		StringBuffer strBuf2 = new StringBuffer(str);
		strBuf2.reverse();
		if(strBuf1.toString().equals(strBuf2.toString()))
			System.out.println(strBuf1);
		
		
	}

}
