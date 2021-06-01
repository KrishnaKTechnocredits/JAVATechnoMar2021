package shivani.Coding_test2_String;

/*Write a program to do sum of int from
given String input:"12h14i4w8sdc15"
	output: 53*/
public class ReturnSumOfString {

	void countInt(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				count = ch;

			}
		}
		System.out.println("Sun of given String is " + (count++));

	}

	public static void main(String[] args) {
		ReturnSumOfString returnSumOfString = new ReturnSumOfString();
		returnSumOfString.countInt("12h14i4w8sdc15");
	}

}
