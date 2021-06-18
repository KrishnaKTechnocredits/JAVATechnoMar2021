package amrutaM.arrayAssignments;

import java.util.Scanner;

/*Array Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.
*/

public class NumberPresence {

	boolean isNumberPresent(int[] number, int target) {
		for (int index = 1; index < number.length; index++) {
			if (number[index] == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		NumberPresence numberPresence = new NumberPresence();
		int input[] = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number of your choice");
		int targetNumber = scanner.nextInt();
		boolean flag = numberPresence.isNumberPresent(input, targetNumber);
		if (flag==true) {
			System.out.println(targetNumber + " is present in the array");
		}else {
			System.out.println(targetNumber + " is not present in the array");
		}
		
	}
}
