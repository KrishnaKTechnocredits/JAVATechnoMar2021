package technocredits.arrayDemo;

import java.util.Scanner;

public class Example3 {

	void display(String[] input) {
		System.out.println("--------------------------------");
		for(int index=0 ;index<input.length;index++) {
			System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter ? ");
		int size = scanner.nextInt();
		String[] name = new String[size];
		
		for(int index=0;index<name.length;index++) {
			System.out.println("Enter name : ");
			name[index] = scanner.next();
		}
		
		new Example3().display(name);
		
		
	}
}
