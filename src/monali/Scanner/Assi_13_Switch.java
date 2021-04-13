package monali.Scanner;

import java.util.Scanner;


public class Assi_13_Switch {
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char ");
		String input = sc.next();
		char ch = input.charAt(0);
	
		switch (ch) {
		case 'a':
			System.out.println("given char is vowel A");
			break;
		case 'b':
			System.out.println("given char is not vowel");
			break;
		case 'e':
			System.out.println("given char is vowel E");
			break;
		case 'd':
			System.out.println("given char is not vowel");
			break;
		case 'i':
			System.out.println("given char is vowel I");
			break;
		case 'o':
			System.out.println("given char is vowel O");
			break;
		case 'u':
			System.out.println("given char is vowel U");
			break;
		 default:
			System.out.println("given char is invalid input");
			break;
		}

	}
}
