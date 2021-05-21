package kangan.Coding.Exam2;

/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/

public class SumInteger {

	void getSum(String input) {
		String temp ="0";
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
						if(Character.isDigit(ch)) 
							temp =temp+ ch;
						
						else {
							sum = sum + Integer.parseInt(temp);
							//System.out.println(sum);
							temp="0";
						}
		}
		sum=sum +Integer.parseInt(temp);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		SumInteger sumInteger = new SumInteger();
		sumInteger.getSum("12h14i4w8sdc15");
	}
}
