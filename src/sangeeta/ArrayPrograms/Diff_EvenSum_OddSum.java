/* return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}*/

package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class Diff_EvenSum_OddSum {
	int evensum;
	int oddsum;
		int getDifference(int[] arr) {
			for(int index = 0;index<arr.length;index++) {
				if(arr[index]%2 == 0)
					evensum = evensum + arr [index];
				else
					oddsum = oddsum + arr [index];
			}
				int output = evensum - oddsum;
				System.out.println("Difference of sum of Even and Odd numbers is "+output);
				return output;
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
			new Diff_EvenSum_OddSum().getDifference(arr);
		}

}
