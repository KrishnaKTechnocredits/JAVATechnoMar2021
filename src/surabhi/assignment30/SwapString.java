package surabhi.assignment30;

import java.util.Scanner;

import krati_Shukla.Practice.SubString;

public class SwapString {
	void displaySwapStrings(String str1, String str2) {
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length(),str1.length());
		System.out.println("Strings After swapping :" +str1+" and "+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapString swapString=new SwapString();
		System.out.println("Enter the two Strings ");
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.next();
		String str2=scanner.next();
		swapString.displaySwapStrings(str1, str2);
	}

}
