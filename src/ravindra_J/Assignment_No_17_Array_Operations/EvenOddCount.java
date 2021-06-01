/*Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
*/
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class EvenOddCount {
	
	
	static Scanner scanner ;
	
	static int size;
	public static void main(String []args){
		
		scanner = new Scanner(System.in);
		System.out.println("what is size of an array");
		size = scanner.nextInt();
		
		System.out.println("Please enter the "+size+" array elements");
		int []arr = new int[size];
		new EvenOddCount().CountOddEvenNumber(arr);
		}

	 void CountOddEvenNumber(int[] arr){
		int evenCount=0,oddCount=0,cnt=1;
		for(int index=0;index<size;index++) {
			System.out.println("Please Enter Number " +cnt);
				arr[index]=scanner.nextInt();
				cnt++;
				if(arr[index]%2==0)
					evenCount++;
				else
					oddCount++;
		}
	System.out.println("Even number count are : " +evenCount);
	System.out.println("Odd number count are : " +oddCount);
	}
}
