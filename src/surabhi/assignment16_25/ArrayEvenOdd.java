package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
odd ->  array.length - evenCount
*/
public class ArrayEvenOdd {
	
	void printCount(int[] num) {
		int evenCount=0,oddCount;
		for(int index=0;index<num.length;index++) {
			if(num[index]%2==0) {
				evenCount++;
			}
		}
		oddCount=num.length-evenCount;
		System.out.println("Even Count is :"+evenCount+ " and odd Count is :"+oddCount);
	}
	 
	public static void main(String[] args) {
		ArrayEvenOdd arrayEvenOdd=new ArrayEvenOdd();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array element number at "+index);
			arr[index]=scanner.nextInt();
		}
		arrayEvenOdd.printCount(arr);	
	}
}
