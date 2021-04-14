package sai.Assignment17;

/*
 * Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

 */
public class RetrunTrueArray {

	public static void main(String[] args) {
		int[] num = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		RetrunTrueArray retrunTrueArray = new RetrunTrueArray();
		retrunTrueArray.isNumberPresent(num);

	}

	boolean isNumberPresent(int[] num) {
		int targetNumber = 45;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == targetNumber) {
				System.out.println("Target Number " + targetNumber + " found in the given array");
				return true;
			}
		}
		System.out.println("Number " + targetNumber + " not found in the given array");
		return false;
	}
}
