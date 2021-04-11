package technocredits.scannerDemo;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ans = "";
		do {
			ans = scanner.next().toUpperCase();
			System.out.println(ans);
		}while (ans.equals("Y"));

	}
}
