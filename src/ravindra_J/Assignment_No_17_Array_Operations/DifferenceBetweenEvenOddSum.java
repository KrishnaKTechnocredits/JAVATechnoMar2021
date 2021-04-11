/*Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum

	int getDifference(int[] input){

	}
 */
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class DifferenceBetweenEvenOddSum {
	static int evenCount=0, oddCount=0, evenSum=0 , oddSum=0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter size of an array");
		int size = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[size];
		System.out.println("Eneter the "+size+" numbers");
		for (int index=0;index<size;index++) {
			arr[index]=Integer.parseInt(scanner.nextLine());
			if(arr[index] % 2 == 0) {
				evenCount++;
				evenSum = evenSum+arr[index];
				evenSum =+ evenSum;
			}
			else { 
				oddCount++;
				oddSum = oddSum+arr[index];
				oddSum =+ oddSum;
			}
		}
		scanner.close();

		DifferenceBetweenEvenOddSum difference =  new DifferenceBetweenEvenOddSum();
		
		difference.getEvenOddSum();
		difference.getEvenOddCount();
		difference.getDifference();	
	}

	int getEvenOddSum() {
		System.out.println("Sum of even numbers are - "+evenSum+" and \n Sum of odd numbers are - "+oddSum);
		return 0;
	}
	int getEvenOddCount() {
		System.out.println("Even numbers count in a given array are - "+evenCount+" and \n Odd umbers count in a given array are - "+oddCount);
		return 0;
	}
	int getDifference(){
		int diff = evenSum - oddSum;
		System.out.println("difference between sum of even number "+evenSum+" and odd numbers "+oddSum+" is : " +diff);
		return diff;
	}


}
