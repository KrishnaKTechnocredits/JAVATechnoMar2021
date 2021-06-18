package gauravk.Assignment_3;
/*##
 * WAP to take input from user about how many numbers to analyse. Also accept numbers from users in to an array.
 * Total all content of array and display.
 */

import java.util.Scanner;

public class SumOfArray {
	int sum;
	void arraySum(int[] x) {
		for(int index=0; index<x.length; index++) {
			sum = sum + x[index];
		}
	}
		
	public static void main(String[] args) {
		SumOfArray sumOfArray1 = new SumOfArray();
		System.out.println("How many numbers are you willing to analyse? ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] inp = new int[i];
		for(int index=0; index<i; index++) {
			System.out.println("type "+(index+1)+" number");
			inp[index] = sc.nextInt();
		}
		sumOfArray1.arraySum(inp);
		System.out.println("sum is "+sumOfArray1.sum);
	}
}