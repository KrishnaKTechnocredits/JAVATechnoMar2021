/*
 Assignment - 17 : 10th April'2021
Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FindMinNum {
	int findMin(int[] num) {
		int min=num[0];
		for(int index=1;index<num.length;index++) {
			if(min>num[index]) {
				min=num[index];
			}
		}
		return min;
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
		int minnum=new FindMinNum().findMin(arr);
		System.out.println("Minimum number in given array is " + minnum);
		sc.close();
	}
}

