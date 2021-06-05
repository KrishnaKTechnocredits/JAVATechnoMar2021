//Return the line having max freq of word techno.

package sangeeta.CodingExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodingExam20_P1 {

	static int getMaxFreqOfWord(String input, String targetWord) {
		String[] arr = input.split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(arr));
		int count = 0;
		while (listOfWords.contains(targetWord)) {
			listOfWords.remove(targetWord);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\sangeeta\\CodingExam\\file1");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line1 = "";
		String Line = "";
		int maxCount = 0;
		while ((line1 = br.readLine()) != null) {
			int count = getMaxFreqOfWord(line1, "credits");
			if (count > maxCount) {
				maxCount = count;
				Line = line1;
			}
		}
		System.out.println(Line + " : " + maxCount);
		br.close();
	}
}
