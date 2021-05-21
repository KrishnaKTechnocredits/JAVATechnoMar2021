package madhavi_Khasbage.CharacterPrograms;

import java.util.Scanner;

/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/
public class SumOfNumInString {

	int getCount(String my_str) {
		int sum = 0;
		for (int index = 0; index < my_str.length(); index++) {
			char ch = (char) my_str.charAt(index);
			int asciiVal = my_str.charAt(index);	
			if (asciiVal >= 48 && asciiVal <= 57) {
				int num=Integer.parseInt(String.valueOf(ch)); 
				sum += num;
			}				
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumInString findCnt = new SumOfNumInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string input:");
		String str = scanner.nextLine();
		int digitCnt = findCnt.getCount(str);
		System.out.println("Sum of digits in the string :" + digitCnt);
		scanner.close();
	}
}
