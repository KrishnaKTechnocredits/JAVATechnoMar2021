/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

package krati_Jain.Assignment_17;

import java.util.Scanner;

public class MinNumberInArray {
	int count = 0;
	
	public static void main(String[] args) {
		MinNumberInArray minNum = new MinNumberInArray();
		minNum.setData();
	}
	
	void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the array you want to create? (should be whole/positive number)");
		int arrLen = scan.nextInt();
		int[] myArray = new int[arrLen];
		System.out.println("Input Array element for your Array");
		for (int index = 0; index < arrLen; index ++) {
			myArray[index] = scan.nextInt();
		}
		int minimumNumber = findMinNumber(myArray);
		if (count==myArray.length-1)
			System.out.println("All numbers in the array are same : " + minimumNumber);
		else
			System.out.println(minimumNumber + " is the smallest number in our array");
	}
	
	int findMinNumber(int[] myArray) {
	int tempNum = myArray[0];
		for (int index = 1; index<myArray.length; index++ ) {
			if ((myArray[index]) < tempNum ) {
				tempNum = myArray[index];
			}
			else if ((myArray[index]) == tempNum ) {
				count++;
			}
		}
	return tempNum;
	}

}
