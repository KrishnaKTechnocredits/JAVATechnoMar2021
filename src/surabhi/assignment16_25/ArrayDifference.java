package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 2:  return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum
		
		int getDifference(int[] input){	
		}*/

public class ArrayDifference {
	
	int getDifference(int[] input) {
		int evenNumbers=0, oddNumbers=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]%2==0) {
				evenNumbers=evenNumbers+input[index];
			}else {
				oddNumbers=oddNumbers+input[index];
			}
		}
		return (evenNumbers-oddNumbers);
	}
	
	void printDifference(int diff) {
		System.out.println("Difference of even sum and odd sum is :"+diff);
	}

	public static void main(String[] args) {
		ArrayDifference arrayDifference=new ArrayDifference();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array element number at "+index);
			arr[index]=scanner.nextInt();
		}
		int diff=arrayDifference.getDifference(arr);
		arrayDifference.printDifference(diff);
	}

}
