package kangan.Coding.Exam20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2*/
public class CountOfWords {

	static int getWordCount(String line, String target) {
		if (line.charAt(line.length() - 1) == '.')
			line = line.substring(0, line.length() - 1);
		String input[] = line.split(" ");
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList(input));
		int count = 0;
		while (newList.contains(target)) {
			newList.remove(target);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\kangan\\Coding\\Exam20\\InputFile.txt");
		File file1 = new File(".\\src\\kangan\\Coding\\Exam20\\ListOfWords.txt");
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		String line1 = "";
		String word1 = "";
		while ((word1 = br1.readLine()) != null) {
			int count = 0;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line1 = br.readLine()) != null) {
				int cnt = getWordCount(line1, word1);
				count = count + cnt;
			}
			System.out.println(word1 + " : " + count);
			br.close();
		}
		br1.close();
	}

}
