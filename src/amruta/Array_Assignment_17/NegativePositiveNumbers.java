/*  10th April 21 --- Assignment 17 ---- Program No 3 :
 Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
 */


package amruta.Array_Assignment_17;

public class NegativePositiveNumbers {
	
	int negativecount;
	
	void countofNegativePositiveNumbers(int[] num) {
	
		for(int index=0; index<num.length; index++) {
			if(num[index] < 0)
				negativecount++;
		}
		System.out.println("Count of Negative numbers in given array is: "+negativecount);
		System.out.println("Count of Positive numbers in given array is: "+(num.length-negativecount));		
	}
	
	public static void main(String[] args) {
		int[] num = {10,23, -26, 27, -88, 87, -65};
		new NegativePositiveNumbers().countofNegativePositiveNumbers(num);
	}
}
