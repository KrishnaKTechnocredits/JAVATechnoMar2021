/*From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/
package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class MaximumNumber {
	
	void findMaxNumber(int [] arr) {
		int max = arr[0];
		for(int index = 1; index<arr.length;index++) {
				if(arr[index]>max) 
					max = arr[index];	
		}
			System.out.println("Maximum number from given array is "+max);
	}
	 
	public static void main(String[] a) {
		MaximumNumber maximumNumber = new MaximumNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter elements of  an Array: ");
			arr[index] = scanner.nextInt();
		}
		maximumNumber.findMaxNumber(arr);
	}

}
