/*
Coding Exam -2:26th April 2021

Program 1:
WAP to do sum of all integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */
package radha.CodingExam2;

public class FindSumOfIntegersInString {
	
	int findSumOfIntegers(String input) {
		int length = input.length();
		int sum = 0;
		String temp = "";
		for(int index=0; index < length;index++) {
			if(Character.isDigit(input.charAt(index))) {
				if(index < length -1 && Character.isDigit(input.charAt(index+1))) {
					temp  += input.charAt(index);
				}
				else
				{
					temp += input.charAt(index);
					sum+=Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		FindSumOfIntegersInString findSum = new FindSumOfIntegersInString();
		String str = "12h14i4w8sdc15";
		int sum = findSum.findSumOfIntegers(str);
		System.out.println("Sum of integers in given string is "+sum);
	}

}
