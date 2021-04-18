/*
 Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
 */

package pavan.Assignment17;

public class MaxNumberFromArray {

	int maxNumber(int[] args) {
		int maxnumber = args[0];
		for (int index = 1; index < 7; index++) {
			if (maxnumber < args[index]) {
				maxnumber = args[index];
			}
		}
		
		return maxnumber;
	}
	public static void main(String[] args) {
		int[] num = { 22, 35, 65, 88, 11, 23, 45 };
		MaxNumberFromArray test6 = new MaxNumberFromArray();
		int maximum=test6.maxNumber(num);
		System.out.println("maximum number is "+ maximum);
	}	
}