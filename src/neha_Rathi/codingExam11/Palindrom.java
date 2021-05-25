package neha_Rathi.codingExam11;

public class Palindrom {
	
	static void PalindromeNum(int num) {
		int rem = 0;
		int reversNumber = 0;
		int num1 = num;
		while (num1 > 0) {
			rem = num1 % 10;
			reversNumber = reversNumber * 10 + rem;
			num1 = num1 / 10;
		}
		if (reversNumber == num)
			System.out.println(num + " is palindrom");
		else
			System.out.println(num + " is not palindrom");
	}

	public static void main(String[] a) {
		int num = 12323;
		int num1 = 15251;
		PalindromeNum(num);
		PalindromeNum(num1);
	}

}
