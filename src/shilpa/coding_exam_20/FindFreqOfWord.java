/*Program 1:  Return the line having max freq of word techno.*/
package shilpa.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindFreqOfWord {

	int getWordFreq(String inputLine, String targetWord) {
		String[] lineArr = inputLine.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(lineArr));
		int cnt = 0;
		while (list.contains(targetWord)) {
			list.remove(targetWord);
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		FindFreqOfWord findFreqOfWord = new FindFreqOfWord();
		File file1 = new File(".\\src\\shilpa\\coding_exam_20\\ListOfWords.txt");
		File file2 = new File(".\\src\\shilpa\\coding_exam_20\\inputFile.txt");

		Scanner scWord = new Scanner(file1);
		System.out.println("Frequency of words from inputFile");
		while (scWord.hasNextLine()) {
			String word = scWord.nextLine();
			Scanner scLine = new Scanner(file2);
			int cnt = 0;
			while (scLine.hasNext()) {
				String line = scLine.nextLine();
				cnt = cnt + findFreqOfWord.getWordFreq(line, word);
			}
			System.out.println(word + " " + cnt);
			scLine.close();
		}
		scWord.close();
	}
}
