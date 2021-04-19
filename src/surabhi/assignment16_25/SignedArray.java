package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

public class  SignedArray{
	
	void printCount(int[] num) {
		int positiveCount=0,negativeCount;
		for(int index=0;index<num.length;index++) {
			if(num[index]>=0) {
				positiveCount++;
			}
		}
		negativeCount=num.length-positiveCount;
		System.out.println("Poitive Count is :"+positiveCount+ " and Negative Count is :"+negativeCount);
	}

	public static void main(String[] args) {
		SignedArray signedArray=new SignedArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array element number at "+index);
			arr[index]=scanner.nextInt();
		}
		signedArray.printCount(arr);	
	}

}
