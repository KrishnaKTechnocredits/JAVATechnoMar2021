package ankit.coding_exam_9;

import java.util.Arrays;

public class NumberReverse {
	
	static int reverseNumber(int input){
		int rem =0;
		int output=0;
		int num = input;
		while(num > 0) {
			rem = num % 10;
			num = num/10;
			output = output * 10 + rem;
		}
		return output;
	}

	public static void main(String[] args) {
		int input = 1234;
		System.out.println("Input :"+input);
		System.out.println("Reversed Output :"+reverseNumber(input));
	}

}





