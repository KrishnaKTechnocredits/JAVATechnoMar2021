/*Assignment - 17 : 10th April'2021

Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount

Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum

int getDifference(int[] input){

}

Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4


Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4

Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)

}

Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

package kapil.Array;

import java.util.Scanner;

public class IntNumber {

	void getCountEvenOddNo(int[] input) {
		int evencount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evencount++;
		}
		{
			System.out.println("Even number count : " + evencount);
			System.out.println("Odd number count : " + (input.length - evencount));
		}
	}

	public static void main(String[] args) {
		IntNumber intnumber = new IntNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to enter ?");
		int size = scanner.nextInt();
		int[] num = new int[size];

		for (int index = 0; index < num.length; index++) {
			System.out.println("Enter number : ");
			num[index] = scanner.nextInt();
		}
		{
			intnumber.getCountEvenOddNo(num);
		}
	}
}