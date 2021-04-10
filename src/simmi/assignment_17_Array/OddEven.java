/*Assignment - 17 : 10th April'2021

Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount*/

package simmi.assignment_17_Array;

public class OddEven {
	
	void printOddEven() {
		int odd = 0;
		int even = 0;
		int[] arr = {10,23,26,27,88,87,65};
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(" Total even numbers are: " + even);
		System.out.println(" Total odd numbers are: " + odd);
	}
	
	
	public static void main(String[] args) {
		OddEven oddEven = new OddEven();
		oddEven.printOddEven();
	}
}
