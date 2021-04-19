/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class MinNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the size of an arrray");
		int size = scanner.nextInt();
		
		int[] num = new int[size];
		System.out.println("Please enter the all "+size+" elements of arrray with space");
		for(int index = 0; index < size ; index++) {
			num[index]= scanner.nextInt();
			}
		
		new MinNumber().findMinNumber(num);
	}
	
	int findMinNumber(int[] num) {
		int minNum = num[0];
		for(int index=1; index<num.length; index++) {
			if(num[index] < minNum)
				minNum = num[index];
		}
		System.out.println("Min number in given array is :"+minNum);
		return minNum;
	}
}
