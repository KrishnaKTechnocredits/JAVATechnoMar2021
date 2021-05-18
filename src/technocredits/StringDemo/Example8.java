package technocredits.StringDemo;

import java.util.Scanner;

public class Example8 {
	static String str6 = "Hi";
	String str7 = "Hi";
	
	public static void main(String[] args) {
		String str1 = "Techno";
		String str2 = "Tech" + "no"; // "Techno"
		System.out.println(str1 == str2);
		
		String str3 = " Maulik ";
		String str4 = "Maulik";
		System.out.println(str3.trim() == str4);
		
		Scanner sc = new Scanner(System.in);
		String bank = "SBI";
		
		String userGivenBank = new String("SBI");
		
		if(bank == userGivenBank)
			System.out.println("1");
		else
			System.out.println("2");
		
		String str5 = "Hi";
		System.out.println(str5 == str6);
		
	}
}
