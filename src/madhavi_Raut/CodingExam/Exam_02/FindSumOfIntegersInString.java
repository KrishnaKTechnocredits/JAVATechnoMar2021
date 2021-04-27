package madhavi_Raut.CodingExam.Exam_02;
/*Program 1 : 
WAP to do sum of all the integer from the given string
Input: String str = "12h14i4w8sdc15"
Output: 12+14+4+8+15 = 53*/

public class FindSumOfIntegersInString {

	int getSumOfIntegersInString(String str) {
		String tempStr = "0";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				tempStr += ch;
				if (index == str.length() - 1) {
					sum += Integer.parseInt(tempStr);
				}
			} else {
				sum += Integer.parseInt(tempStr);
				tempStr = "0";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Below is the sum of integers present in given string:");
		System.out.println(new FindSumOfIntegersInString().getSumOfIntegersInString("12h14i4w8sdc15"));
	}
}
