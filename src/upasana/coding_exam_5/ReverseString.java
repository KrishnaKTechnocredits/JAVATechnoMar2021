/*
 Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
 */

package upasana.coding_exam_5;

public class ReverseString {

	static String getRevWordString(String str) {

		String output = "";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			StringBuffer sb1 = new StringBuffer(arr[index]);

			output = output + " " + sb1.reverse();
		}

		return output;
	}

	public static void main(String[] args) {

		String input = "hi hello how are you";
		String output = getRevWordString(input);

		System.out.println(output);
	}
}
