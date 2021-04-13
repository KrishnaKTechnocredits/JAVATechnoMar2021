/*Program 6: From given array return max number.
	input : 22,35,65,88,11,23,45
	output : 88*/

package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class MaxNumber {

		
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter the size of an arrray");
			int size = scanner.nextInt();
			
			int[] num = new int[size];
			System.out.println("Please enter the all "+size+" elements of arrray with space");
			for(int index = 0; index < size ; index++) {
				num[index]= scanner.nextInt();
				}
			
			new MaxNumber().findMaxNumber(num);
		}
		
		int findMaxNumber(int[] num) {
			int maxNum = num[0];
			for(int index=1; index<num.length; index++) {
				if(num[index] > maxNum)
					maxNum = num[index];
			}
			System.out.println("Max number in given array is :"+maxNum);
			return maxNum;
		}
		
	}

