/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

package simmi.assignment_17_Array;

public class NegativePositive {
	
	void countNegativePositive() {
		int positive = 0;
		int negative = 0;
		int[] arr = {10,23,26,-27,-88,87,-65};
		for(int index = 0; index<arr.length;index++) {
			if(arr[index] > 0) {
				positive++;
			}
			else {
				negative++;
			}
		}
		System.out.println("Total positive number is: " +positive);
		System.out.println("Total negative number is: " +negative);
	}
	
	public static void main(String[] args) {
		NegativePositive negativePositive = new NegativePositive();
		negativePositive.countNegativePositive();
	}	
}
