/*
 Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

 */

package pavan.Assignment17;

public class VerifyIfNumberIsPresent {
	boolean isNumberPresent(int[] args, int tar) {
		boolean ret = false;

		for (int index = 0; index < 9; index++) {
			if (args[index] == tar) {
				ret = true;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] num = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		VerifyIfNumberIsPresent verifyIfNumberIsPresent = new VerifyIfNumberIsPresent();
		boolean ans = verifyIfNumberIsPresent.isNumberPresent(num, 45);
		if (ans == true)
			System.out.println("No 45 found in given array");
		else
			System.out.println("No 45 does not found in given array");

}
}