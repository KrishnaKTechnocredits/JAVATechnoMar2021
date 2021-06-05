//Program 1 : 
//WAP to do sum of all the integer from the given string
//Input: String str = "12h14i4w8sdc15"
//Output: 12+14+4+8+15 = 53

package neha_Rathi.codingExam2;

public class SumOfIntInString {

	static int sum(String input) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
			else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum += Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		String str = "12h14i4w8sdc15";
		System.out.println(sum(str));
	}
}
