/*Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.*/

package rahul_Hiremath.assignment_17;

import java.util.Scanner;

public class Ass_17_5 {

	int targetNum;

	boolean checkIfPresent(int[] array, int num) {
		targetNum = num;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Ass_17_5 ass_17_5 = new Ass_17_5();
		int[] array = { 10, 23, 23, 44, 23, 10, 23, 4, 23, 9, 0 };
		System.out.println("Please tell us the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean flag = ass_17_5.checkIfPresent(array, num);
		if (flag == true)
			System.out.println("Number " + num + " is present in array");
		else
			System.out.println("Number " + num + " is not present in array");
		scanner.close();
	}
}
