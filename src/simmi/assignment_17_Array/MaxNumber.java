/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

package simmi.assignment_17_Array;

public class MaxNumber {
	int maximum() {
		int[] arr = {22,35,65,88,11,23,45};
		int maxIndex = arr[0];
		for(int index = 1; index<arr.length; index++) {
			
			if(maxIndex<arr[index]) {
				maxIndex = arr[index];
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args) {
		MaxNumber maxNumber = new MaxNumber();
		int maximum = maxNumber.maximum();
		System.out.println("Maximum number in the given array is: "+maximum);
	}

}
