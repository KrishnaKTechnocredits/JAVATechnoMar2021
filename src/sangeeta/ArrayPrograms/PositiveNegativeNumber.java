/*From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class PositiveNegativeNumber {
	int positivecount;
	void Positive_Negative_Count(int [] arr) {
		for(int index = 0;index<arr.length;index++) {
			if(arr[index] >= 0)
				positivecount++;
		}
		
		int negativeCount = arr.length - positivecount;
		System.out.println("Positive numbers in an array are "+positivecount);
		System.out.println("Negative numbers in an array are "+negativeCount);
		
}
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int index =0; index<arr.length;index++) {
			System.out.println("Enter numbers of Array: ");
			arr[index] = scanner.nextInt();
		}
		new PositiveNegativeNumber().Positive_Negative_Count(arr);			
	
	}

}
