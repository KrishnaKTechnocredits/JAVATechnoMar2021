package technocredits.scannerDemo;

import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = scanner.next();
		System.out.println("Enter rno : ");
		int rno = scanner.nextInt();
		System.out.println("Name is " + name + " and rno is " + rno);
	}
}
