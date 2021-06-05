/*
Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.
*/

package sandesh.coding_exam_20;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReturnLineHavingMaxFreqOfGivenWord {

	static int maxCountOfWords;
	static String maxCountWordLine;

	private void getLineHavingMaxFreqOfGivenWord(String inputLine, String inputWordToFind) {
		String processedInputLine = inputLine.trim();
		int countOfWord = 0;
		while (processedInputLine.contains(inputWordToFind)) {
			countOfWord++;
			processedInputLine = processedInputLine.replaceFirst(inputWordToFind, "*");
		}
		if (maxCountOfWords < countOfWord) {
			maxCountOfWords = countOfWord;
			maxCountWordLine = inputLine;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(new File(".\\src\\sandesh\\coding_exam_20\\file1.txt"));
		String wordToFind = "techno";
		String currentLine = "";
		while (sc1.hasNextLine()) {
			currentLine = sc1.nextLine();
			new ReturnLineHavingMaxFreqOfGivenWord().getLineHavingMaxFreqOfGivenWord(currentLine, wordToFind);
		}
		System.out.println(maxCountWordLine);
		sc1.close();
	}
}
