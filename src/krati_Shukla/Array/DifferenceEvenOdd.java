//Program 2: return a difference between sum of even number and odd numbers.

package krati_Shukla.Array;

public class DifferenceEvenOdd {
	
	void difference(int[] num) {
		int sumEven=0, sumOdd=0;
		for(int index=0; index<num.length; index++) {
			if (num[index]%2 == 0)
				sumEven = sumEven+num[index];
			else
				sumOdd = sumOdd+num[index];
		}
		int diff = sumEven-sumOdd;
		System.out.println("The difference between Even & Odd nos are "+diff);
	}
	
	public static void main(String[] a) {
		DifferenceEvenOdd differenceEvenOdd = new DifferenceEvenOdd();
		int[] num = {10,23,26,27,88,87,65};
		differenceEvenOdd.difference(num);
	}

}
