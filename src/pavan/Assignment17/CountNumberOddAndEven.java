/*
 Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
 */

package pavan.Assignment17;

public class CountNumberOddAndEven {
	int count=0;
	
	void countNumber(int[] args) {
		

		for (int index = 0; index < 7; index++) {
			if (args[index] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Total even numbers are: " + count);
		System.out.println("Total Odd Number are: " + (args.length - count));
	}

	public static void main(String[] args) {

		int[] num = { 10, 23, 26, 27, 88, 87, 65 };
		new CountNumberOddAndEven().countNumber(num);
	}
}
