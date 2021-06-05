package monali.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class File_Reading_Program_2 {
	
	static int getWordCount(String input, String targetword) {
		if (input.charAt(input.length() - 1) == '.')
			input = input.substring(0, input.length() - 1);
		String[] arr = input.split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(arr));
		int count = 0;
		while (listOfWords.contains(targetword)) {
			listOfWords.remove(targetword);
			count++;

		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File file1 = new File(".\\src\\monali\\coding_exam_20\\newFile.txt");
		File file2 = new File(".\\src\\monali\\coding_exam_20\\file1.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(file2));

		String word = " ";
		String line1 = " ";
		int count = 0;

		while ((word = br2.readLine()) != null) {
			count = 0;
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			while ((line1 = br1.readLine()) != null) {
				count += getWordCount(line1, word);
			}
			System.out.println(word + " : " + count);
			count = 0;
			br1.close();
		}
		br2.close();

	}
}
