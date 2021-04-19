/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

package simmi.assignment_17_Array;

public class MinNumber {
	int minimum() {
		int[] arr = {22,35,65,88,11,23,45};
		int minIndex = arr[0];
		for(int index = 1; index < arr.length; index++) {
			if(minIndex > arr[index]) {
				minIndex = arr[index];
			}
		}
		return minIndex;
	}
	
	public static void main(String[] args) {
		MinNumber minNumber = new MinNumber();
		int minimum = minNumber.minimum();
		System.out.println("Minimum number in the given array is: "+minimum);
	}

}
