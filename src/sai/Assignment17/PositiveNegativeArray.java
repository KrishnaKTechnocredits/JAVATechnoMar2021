package sai.Assignment17;
/*
 * Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4

 */

public class PositiveNegativeArray {

	public static void main(String[] args) {
		int[] num = { 10, 23, 26, -27, -88, 87, -65 };
		PositiveNegativeArray positiveNegativeArray = new PositiveNegativeArray();
		positiveNegativeArray.count(num);
	}

	void count(int[] num) {

		int posCount = 0;
		int negCount = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] < 0)
				negCount++;
			else
				posCount++;
		}
		System.out.println("Positive number count is " + posCount);
		System.out.println("Negative number count is " + negCount);
	}

}
