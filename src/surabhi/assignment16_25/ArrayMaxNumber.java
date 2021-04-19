package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

public class ArrayMaxNumber {
	
	int getMaxValue(int[] number) {
		int max=number[0];
		for(int index=1;index<number.length;index++) {
			if(number[index]>max) {
				max=number[index];
			}
		}
		return max;
	}
	
	void printMaxNumber(int number) {
		System.out.println("Maximum number is :"+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMaxNumber arrayMaxNumber=new ArrayMaxNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array element number at "+index);
			arr[index]=scanner.nextInt();
		}
		int max=arrayMaxNumber.getMaxValue(arr);
		arrayMaxNumber.printMaxNumber(max);
	}

}
