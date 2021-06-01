package technocredits.arrayDemo;

import java.util.Scanner;

public class Example4 {

	void display(int[] input) {
		System.out.println("--------------------------------");
		for(int index=0 ;index<input.length;index++) {
			System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to enter ? ");
		int size = scanner.nextInt();
		int[] num = new int[size];
		
		for(int index=0;index<num.length;index++) {
			System.out.println("Enter number : ");
			num[index] = scanner.nextInt();
		}
		
		new Example4().display(num);
		
		
	}
}
