package trupti.CodingExam5;

import java.util.Scanner;

public class ReverseString {
	String getReverseWordString(String str) {
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb2=new StringBuffer(str);
		sb2.reverse();
		return sb2.toString();
	}

	public static void main(String[] args) {
		ReverseString reversestring=new ReverseString();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your input string :");
		String str=scanner.nextLine();
		String []input=str.split(" ");
		String output="";
		for(int index=0;index<input.length;index++) {
			String returnString=reversestring.getReverseWordString(input[index]);
			output=output+" "+returnString;
		}
		System.out.println("Output String is :"+output);
		scanner.close();
	}


}
