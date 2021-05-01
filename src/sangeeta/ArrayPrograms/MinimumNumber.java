/* From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/
package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class MinimumNumber {
	
	void findMinNumber(int [] arr) {
		int min = arr[0];
		for(int index = 1; index<arr.length;index++) {
				if(arr[index]<min) 
					min = arr[index];	
		}
			System.out.println("Minimum number from given array is "+min);
	}
	 
	public static void main(String[] a) {
		MinimumNumber minimumNumber = new MinimumNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter elements of  an Array: ");
			arr[index] = scanner.nextInt();
		}
		minimumNumber.findMinNumber(arr);
	}

	

}
