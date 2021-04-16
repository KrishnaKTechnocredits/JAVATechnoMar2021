package mayur.assignment20;

import java.util.Scanner;

public class SumChar {
	int getSum(String str){
		int charSum = 0;
		for(int index =0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))
				charSum = charSum + Character.getNumericValue(str.charAt(index));
		}
			
	return charSum;
	
	}
	
	public static void main(String[] args) {
		SumChar sumChar = new SumChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: " );
		String str = scanner.next();
		int sum = sumChar.getSum(str);
		System.out.println("The sum of entered string is :" +sum);
		scanner.close();
	}

	

}
