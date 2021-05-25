package mayur.coding_exam_4;
import java.util.Scanner;

public class Palindrome {
	String getString(String str) {
		int length = str.length();
		String reverse = "";
		for (int index = length - 1; index >= 0; index--) {
			reverse = reverse + str.charAt(index);
		}
		if (!str.equals(reverse)) {
			str = "";
		}
		return str;
	}

	String getOutput(String input) {
		String strData = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			strData += getString(arr[index]) + " ";
		}
		return strData;
	}

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println(pal.getOutput(str));
		sc.close();
	}

}
