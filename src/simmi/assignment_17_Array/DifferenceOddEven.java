/*Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}*/

package simmi.assignment_17_Array;

public class DifferenceOddEven {
	
	int getDifference(int[] arr) {
		int odd = 0, even = 0, num = 0;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index]%2 == 0) {
				even= even + arr[index];
			}
			else {
				odd = odd + arr[index];
			}
		 num = even - odd;
		}
		return num;
	}
	
	public static void main(String[] args) {
		DifferenceOddEven differenceOddEven = new DifferenceOddEven();
		int[] arr = {10,23,26,27,88,87,65};
		int numStore = differenceOddEven.getDifference(arr);
		System.out.println(" Difference of even and odd: " + numStore);
	}
}
