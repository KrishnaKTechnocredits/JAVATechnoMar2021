/*
 Assignment - 17 : 10th April'2021
Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FindMaxNum {
	
	int findMax(int[] num) {
		int max=num[0];
		for(int index=1;index<num.length;index++) {
			if(max<num[index]) {
				max=num[index];
			}
		}
		return max;
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
		int maxnum=new FindMaxNum().findMax(arr);
		System.out.println("Maximum number in given array is " + maxnum);
		
		sc.close();
	}
}
