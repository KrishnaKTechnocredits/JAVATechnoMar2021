/*From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class EvenOddNumbers {
	int evencount;
			void countofevenOddNumbers(int [] arr) {
				for(int index = 0;index<arr.length;index++) {
					if(arr[index]%2 == 0)
					evencount++;
				}
				int oddcount = arr.length - evencount;
				System.out.println("Even numbers in an array are "+evencount);
				System.out.println("Odd numbers in an array are "+oddcount);
				
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
			new EvenOddNumbers().countofevenOddNumbers(arr);			
		
		}
	

}
