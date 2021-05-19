package krati_Shukla.Exam4;

public class Palindrome {
	void PaliString(String str) {
		String temp="";
		
		int length = str.length();
		for(int index=0; index<length; index++) {
			char ch = str.charAt(index);
			if(ch != ' ') {
				temp = temp + Character.toString(ch);
			}else {
				StringBuffer str1 = new StringBuffer(temp);
				StringBuffer str2 = new StringBuffer(temp);
				str1.reverse();
				if (str1.toString().equals(str2.toString()))
					System.out.println("Palindrome "+ str1);
				temp ="";
			}
				
		}
		
	}
	
	public static void main(String[] a) {
		Palindrome palindrome = new Palindrome();
		String input = "Hi MAM hello NamaN techno";
		palindrome.PaliString(input);
	}
}
