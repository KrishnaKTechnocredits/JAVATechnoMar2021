package trupti.CodingExam11;

import java.util.Scanner;

public class NumberPalindrome {
	boolean isNumberPalindrome(int num) {
		String str=String.valueOf(num);
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb2=new StringBuffer(str);
		sb2.reverse();
		if (sb1.toString().equals(sb2.toString()))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		NumberPalindrome numberpalindrome = new NumberPalindrome();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int input=scanner.nextInt();
		
		boolean output=numberpalindrome.isNumberPalindrome(input);
			if(output==true) 
				System.out.println("Number "+input+" is Palindrome");
		  else
			  System.out.println("Number " +input+ " is not Palindrome");
			scanner.close();
	}
	

}
