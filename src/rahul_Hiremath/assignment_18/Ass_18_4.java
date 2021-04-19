/*Program 4:  write a program which will print characters between ascii value 97 to 122.*/

package rahul_Hiremath.assignment_18;

import java.util.Scanner;

public class Ass_18_4 {

	void printChars(int start, int end) {
		for (int i = start; i <= end; i++) {
			char ch = (char) i;
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {

		Ass_18_4 ass_18_4 = new Ass_18_4();
		System.out.println("Please enter start num");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		System.out.println("Please enter end num");
		int end = scanner.nextInt();
		ass_18_4.printChars(start, end);
		scanner.close();
	}
}
