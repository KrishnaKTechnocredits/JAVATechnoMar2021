/*
 Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FindEvenNoInArray {
	void findEven(int[] num) {
		int evenCount=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]%2==0){
			evenCount++;
			}
			
		}
		System.out.println("No of Even Numbers are - "+ evenCount);
		System.out.println("No of Odd Numbers in an array are - " + (num.length-evenCount));
	}
	
	public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter the elements in an array");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	new FindEvenNoInArray().findEven(arr);
	sc.close();
	}
}

