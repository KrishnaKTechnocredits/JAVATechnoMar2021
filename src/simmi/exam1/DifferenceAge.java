/*Coding Exam - 1 : 18th April 2021

Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package simmi.exam1;

import java.util.Scanner;

public class DifferenceAge {
	int getMaxAge(int[] age) {
		int outputMax = age[0];
		for(int index = 0; index<age.length;index++) {
			if(age[index]>outputMax) {
				outputMax = age[index];
			}
		}
		return outputMax;
	}
	
	int getMinAge(int[] age) {
		int outputMin = age[0];
		for(int index = 0; index<age.length;index++) {
			if(age[index]<outputMin) {
				outputMin = age[index];
			}
		}
		return outputMin;
	}
	

	public static void main(String[] args) {
		DifferenceAge differenceAge = new DifferenceAge();
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total numbers");
		
		int num = scanner.nextInt();
		int arr[] = new int[num];
		for(int index = 0; index<arr.length;index++) {
			System.out.println("Enter ages");
			arr[index] = scanner.nextInt();
		}*/
		int[] arr = {7, 12 ,56, 62, 25};
		System.out.println("Maximum age in array "+differenceAge.getMaxAge(arr));
		System.out.println("Minimum age in array "+differenceAge.getMinAge(arr));
		int difference = differenceAge.getMaxAge(arr) - differenceAge.getMinAge(arr);
		System.out.println("Difference between a Younger and an elder member of the family "+difference);
		//scanner.close();
	}
}
