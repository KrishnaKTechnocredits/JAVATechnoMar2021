/*WAP to reverse a string. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  engineer automation test india globant*/

package sandesh.OWN_Practice_Sandesh_1;

import java.util.Scanner;

public class PrintReverseString {

	String[] getReverseString(String inputString) {
		String eachWord = "";
		int count = 0;
		char[] inputStringCharArray = inputString.trim().toCharArray();
		for (int index = 0; index < inputStringCharArray.length; index++) {
			if (inputStringCharArray[index] == ' ') {
				count++;
			}
		}
		int reverseIndex = count; //for adding each word from last to first index of each word
		String[] outputStringArray = new String[count+1]; //to store the words we need length
		for (int index = 0; index < inputStringCharArray.length; index++) {
			if (inputStringCharArray[index] != ' ') {
				eachWord += inputStringCharArray[index];
			} else if (inputStringCharArray[index] == ' ') {
				outputStringArray[reverseIndex] = eachWord;
				eachWord = "";
				reverseIndex--;
				continue;
			}
		}
		outputStringArray[reverseIndex] = eachWord;
		return outputStringArray;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String which you want to reverse.");
		String strInput = sc1.nextLine();
		String[] processedString = new PrintReverseString().getReverseString(strInput);
		for (int index = 0; index < processedString.length; index++)
			System.out.print(processedString[index] + " ");
		sc1.close();
	}
}
