package technocredits.scannerDemo;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Full name : ");
		sc.nextLine();
		String fullName = sc.nextLine();
		System.out.println(empId);
		System.out.println(fullName);
	}
}
