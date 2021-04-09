package technocredits.scannerDemo;

import java.util.Scanner;

public class Example2 {

	void display(String name, int number) {
		for(int index=1;index<=number;index++) {
			System.out.println("Name is " + name);
		}
	}
	
	public static void main(String[] args) {
		Example2 example1 = new Example2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your name : ");
		String name = scanner.nextLine();
		System.out.println("Enter count : ");
		String inputNumber = scanner.nextLine();
		int number = Integer.parseInt(inputNumber); 
		example1.display(name, number);
	}
}
