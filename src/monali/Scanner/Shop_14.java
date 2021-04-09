package monali.Scanner;

import java.util.Scanner;

public class Shop_14 {
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item ");
		String input = sc.nextLine();
		System.out.println("Enter available stock");
		int input0 = sc.nextInt();
		System.out.println("Enter required Qty2 ");
		int input1 = sc.nextInt();
		if(input0 >= input1) {
		System.out.println("We are happy to help you");
		}
		else{
		System.out.println("Sorry item is out of stock");
	}
		
}
}
		
		