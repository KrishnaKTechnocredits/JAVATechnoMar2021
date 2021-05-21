/*Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
*/

package simmi.exam5;

public class ReverseWord {
	String reverse(String input) {

		String temp = " ";
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {

			StringBuffer sb1 = new StringBuffer(arr[index]);

			temp = temp + " " + sb1.reverse();
		}
		return temp;

	}

	public static void main(String[] args) {
		String input = "hi hello how are you";
		ReverseWord reverseWord = new ReverseWord();
		String reverseInput = reverseWord.reverse(input);
		System.out.println(reverseInput);
	}
}
