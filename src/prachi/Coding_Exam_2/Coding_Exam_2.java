package prachi.Coding_Exam_2;

/*Program 1 : 
WAP to do sum of all the integer from the given string
Input: String str = "12h14i4w8sdc15"
Output: 12+14+4+8+15 = 53*/


public class Coding_Exam_2 {

	void Sum(String input) {
		String temp = "";
		int sum = 0;

		for (int index = 0; index < input.length(); index++) { 

			char ch = input.charAt(index); 

			if (Character.isDigit(ch)) {
				temp = temp + ch;  
			} else if (Character.isLetter(ch)) { 
				if (!temp.equals(""))
					sum = sum + Integer.parseInt(temp); //12 //14 //4 //8 //15
				temp =""; 
			}			
		}

		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		System.out.println("Output Sum is: "+sum);
	}

	public static void main(String[] a) {

		Coding_Exam_2 digitSum = new Coding_Exam_2();
		String str = "12h14i4w8sdc15";
		digitSum.Sum(str);
	}
}