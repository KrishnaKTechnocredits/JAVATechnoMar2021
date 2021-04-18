/*
 Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
 */

package pavan.Assignment17;

public class MinNumberFromArray {
	
	int  minNumber(int[] args) {
		int minnuber = args[0];
		for (int index = 1; index < 7; index++) {
			if (minnuber > args[index]) {
				minnuber = args[index];
			}
		}
		return minnuber;
	}
	public static void main(String[] args) {
		int[] num = { 22, 35, 65, 88, 11, 23, 45 };
		MinNumberFromArray test7 = new MinNumberFromArray();
		int minnum =test7.minNumber(num);
		System.out.println("Minimum Number is : "+minnum );
}
}