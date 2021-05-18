/*Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/

package rahul_Hiremath.exam_2;

public class Exam_2_1 {

	void sumOfAllIntegers(String str) {
		String s1 = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				s1 = s1 + ch;
			else {
				if (!s1.equals(""))
					sum = sum + Integer.parseInt(s1);
				s1 = "";
			}
		}
		if (!s1.equals(""))
			sum = sum + Integer.parseInt(s1);
		System.out.println(sum);
	}

	public static void main(String[] args) {

		Exam_2_1 exam_2_1 = new Exam_2_1();
		String str = "12h14i4w8sdc15";
		exam_2_1.sumOfAllIntegers(str);
	}
}
