/*
 Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum

 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class DifferenceBtwSumOfEvenOdd {
	int getDifference(int[] input){
		int evensum=0,oddsum = 0;
		for(int index=0;index<input.length;index++) {
			if(input[index]%2==0){
				evensum=evensum+input[index];
			}
			else 
			{
				oddsum=oddsum+input[index];
		}
		}
		if(evensum>oddsum) {
		 return (evensum-oddsum);
		}
		else {
		return (oddsum-evensum);
		}
	}
		
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in an array");
		for(int index=0;index<size;index++) {
			arr[index]=sc.nextInt();
		}
		int abc=new DifferenceBtwSumOfEvenOdd().getDifference(arr);
		System.out.println("Difference between EvenSum and OddSum is " + abc);
		sc.close();
	}
}

