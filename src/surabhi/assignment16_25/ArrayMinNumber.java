package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

public class ArrayMinNumber {

	int getMinValue(int[] number) {
		int min=number[0];
		for(int index=1;index<number.length;index++) {
			if(number[index]<min) {
				min=number[index];
			}
		}
		return min;
	}
	
	void printMinNumber(int number) {
		System.out.println("Minimum number is :"+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMinNumber arrayMinNumber=new ArrayMinNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array element number at "+index);
			arr[index]=scanner.nextInt();
		}
		int min=arrayMinNumber.getMinValue(arr);
		arrayMinNumber.printMinNumber(min);
		
	}


}
