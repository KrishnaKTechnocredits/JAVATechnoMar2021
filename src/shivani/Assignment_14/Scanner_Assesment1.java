package shivani.Assignment_14;

import java.util.Scanner;

public class Scanner_Assesment1 {

	void switchCaseEx(int index) {
		switch (index) {
		case 1:
			System.out.println("MonDay");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid day index");
		}
	}

	public static void main(String[] args) {
		System.out.println(" please enter between index 1 to 7");

		Scanner_Assesment1 scanner_Assesment1 = new Scanner_Assesment1();
		Scanner scanner = new Scanner(System.in);
		int vowel = scanner.nextInt();
		scanner_Assesment1.switchCaseEx(vowel);

	}

}
