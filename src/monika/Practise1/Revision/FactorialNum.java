package monika.Practise1.Revision;

import java.util.Scanner;

public class FactorialNum {
	
	static int getFactorial(int input) {
		int tempSum = input, temp = input-1;
		while(temp > 0) {
			tempSum = tempSum * temp;
			temp = temp-1;
		}
		System.out.println(tempSum);
		return tempSum;
	}

	static void getFactorial2(int input) {
		int temp = 1;
		for(int index=1;index<=input;index++) {
			temp = temp *index;
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		// getFactorial(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide integer no : ");
		getFactorial(sc.nextInt());
		
		getFactorial2(5);
	}

}
