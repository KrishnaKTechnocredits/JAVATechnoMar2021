package technocredits.scannerDemo;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str = sc.nextLine();
		System.out.println("Enter input : ");
		String str1 = sc.next();
		int str2 =  sc.nextInt();
		
		System.out.println("str : " + str);
		System.out.println("str1 :" + str1) ;
		System.out.println("str2 : " + str2);
	}
}
