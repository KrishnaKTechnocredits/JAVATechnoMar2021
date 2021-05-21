package ashwini.codingexam2;
/*
 ------------------------------------------------------------------------------------------------------------------------
Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53

 */
public class SumOfDigitInString {
	int sum = 0;
	void getSumOfDigit(String str) {
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			String temp = "";
			if(Character.isDigit(ch)) {
				temp = Character.toString(ch);
				for(int j = index+1; j<str.length(); j++) {
					ch = str.charAt(j);
					if(Character.isDigit(ch)) {
						temp = temp+ch;
						//index++;
					}
					sum = sum+Integer.parseInt(temp);
					index++;
					break;
				}
			}
			
		}
		System.out.println(sum);
	}
		
	public static void main(String[] args) {
		//String str = "12h14i4w8sdc15";
		SumOfDigitInString sumOfDigitInString = new SumOfDigitInString();
		sumOfDigitInString.getSumOfDigit("12h14i4w8sdc15");
	}

}
