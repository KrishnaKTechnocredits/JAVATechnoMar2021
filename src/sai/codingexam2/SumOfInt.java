package sai.codingexam2;

public class SumOfInt {

	static int sum(String input) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
			else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum += Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		String str = "12h14i4w8sdc15";
		System.out.println("Sum of integers in a given string is " + sum(str));
	}
}