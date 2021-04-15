/*Program 3:  write a method which will print ascii value of A to Z.*/

package rahul_Hiremath.assignment_18;

import java.util.Scanner;

public class Ass_18_3 {

	void asciiValueForAToZ(int start, int end) {
		for (int i = start; i <= end; i++) {
			char ch = (char) i;
			System.out.println(i + " : " + ch);
		}
	}

	public static void main(String[] args) {

		Ass_18_3 ass_18_3 = new Ass_18_3();
		System.out.println("Please enter start num");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		System.out.println("Please enter end num");
		int end = scanner.nextInt();
		ass_18_3.asciiValueForAToZ(start, end);
		scanner.close();
	}
}
