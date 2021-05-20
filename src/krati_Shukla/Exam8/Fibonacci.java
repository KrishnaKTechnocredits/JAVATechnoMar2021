//Program 2: Print Fibonacci series up to 8 numbers. 

package krati_Shukla.Exam8;

import java.util.Scanner;

public class Fibonacci {
	
	void getFibonacci(int range) {
		int num1 =0;
		int num2 =1;
		int sum=0;
		System.out.println ("Finonacci series is :");
		System.out.print(num1+ " "+num2+" ");
		for(int index=0; index<range-2 ; index++) {
			sum = num1+num2;
			System.out.print(sum+ " ");
			num1 = num2;
			num2 = sum;
		}
	}
	
	public static void main(String[] a) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println("Enter the range :");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		fibonacci.getFibonacci(range);
	}

}
