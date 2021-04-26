package monika.Array_Coding_Exam;

/*Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15a"

Output: 12+14+4+8+15 = 53*/
public class SumOfAllDigitsInString {

	void getSumOfDigits(String input) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp = temp + input.charAt(index); //15
			} else {
				if (temp != "") {
					sum += Integer.parseInt(temp); //53
					temp = "";
				}
			}

		}
		if (temp != "") { //15
			sum += Integer.parseInt(temp); //38+15 = 53
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfAllDigitsInString obj = new SumOfAllDigitsInString();
		obj.getSumOfDigits("12h14i4w8sdc15");
	}

}
