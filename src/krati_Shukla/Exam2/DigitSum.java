package krati_Shukla.Exam2;

public class DigitSum {

	void Sum(String input) {
		String temp = "";
		int sum = 0;
		int length = input.length();

		for (int index = 0; index < length; index++) { 
			char ch = input.charAt(index); 
			if (Character.isDigit(ch)) {
				temp = temp + ch;  
			} else if (Character.isLetter(ch)) { 
				sum = sum + Integer.parseInt(temp);
				temp ="0"; 
			}			
		}
		sum = sum + Integer.parseInt(temp);
		System.out.println("Sum :"+sum);

	}

	public static void main(String[] a) {

		DigitSum digitSum = new DigitSum();
		String str = "12h14i4w8sdc15";
		digitSum.Sum(str);
	}

}
