/*Coding Exam - 2 : 26th April 2021
 * 
Program 1 : 
WAP to do sum of all the integer from the given string
Input: String str = "12h14i4w8sdc15"
Output: 12+14+4+8+15 = 53

*/



package vaibhav.Practive;

public class CoadingExam2 {

//	static String numStr = "";

	int getSum(String str) {
		int sum = 0;
		String tempNumStr = "";

		for (int index = 0; index < str.length(); index++) {

			char ch;
			ch = str.charAt(index);

			if (Character.isDigit(ch))	
				tempNumStr = tempNumStr + ch;
			else{
				if(!tempNumStr.equals(""))
				sum = sum + Integer.parseInt(tempNumStr);
				tempNumStr = "";
			}

			if(index == str.length()-1) {
			sum = sum + Integer.parseInt(tempNumStr);
			}
			
		}

		return sum;
	}

	public static void main(String[] args) {
		CoadingExam2 coadingExam2 = new CoadingExam2();

		String str = "12h14i4w8sdc15";

		int outputSum = coadingExam2.getSum(str);
		System.out.println("Sum = " + outputSum);
	}
}
