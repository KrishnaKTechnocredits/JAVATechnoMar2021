/*1) validate whether given number is prime or not.*/

package rahul_Hiremath.assignment_23;

import java.util.Scanner;

public class Ass_23_1 {

	void checkPrimeNo(int targetNo) {
		boolean flag = true;
		for (int num = 2; num <= targetNo / 2; num++) {
			if (targetNo % num == 0) {
				flag = false;
				break;
			}
		}
		if (flag == false)
			System.out.println(targetNo + " is not a prime number");
		else
			System.out.println(targetNo + " is a prime number");
	}

	public static void main(String[] args) {
		Ass_23_1 ass_23_1 = new Ass_23_1();
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int targetNum = scanner.nextInt();
		ass_23_1.checkPrimeNo(targetNum);
		scanner.close();
	}
}
