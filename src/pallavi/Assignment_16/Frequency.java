package pallavi.Assignment_16;

import java.util.Scanner;

public class Frequency {

	int count = 0;

	void count(String name, char ch) {
		for (int i = 0; i < name.length() - 1; i++) {
			if (Character.toUpperCase(name.charAt(i)) == Character.toUpperCase(ch))
				count++;

		}
	}

	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter a charcter you want to campare:");
		char c = sc.next().charAt(0);
		frequency.count(name, c);
		System.out.println("Count is :" + frequency.count);
	}

}
