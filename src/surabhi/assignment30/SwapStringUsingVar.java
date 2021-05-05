package surabhi.assignment30;

import java.util.Scanner;

public class SwapStringUsingVar {
	void displaySwapStrings(String str1, String str2) {
		String temp="";
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("Strings After swapping :" +str1+" and "+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapStringUsingVar swapStringUsingVar=new SwapStringUsingVar();
		System.out.println("Enter the two Strings ");
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.next();
		String str2=scanner.next();
		swapStringUsingVar.displaySwapStrings(str1, str2);
	}

}
