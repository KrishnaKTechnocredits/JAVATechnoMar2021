//Program 3: From given numbers, count the negative and positive numbers.

package krati_Shukla.Array;

public class PositiveNegative {
	
	void posNeg(int[] num) {
		int positive=0 , negative=0;
		for(int index=0; index<num.length; index++) {
			if (num[index] > 0)
				positive = positive+1;
			else
				negative = negative+1;
		}
		System.out.println("Total "+positive+" positive numbers are present");
		System.out.println("Total "+negative+" negative numbers are present");
	}
	
	public static void main(String[] a) {
		PositiveNegative positiveNegative = new PositiveNegative();
		int[] num = {10,23,26,-27,-88,87,-65};
		positiveNegative.posNeg(num);
	}
		
}
