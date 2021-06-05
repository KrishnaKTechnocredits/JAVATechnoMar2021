package monali.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class File_reading_program1 {

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
		File file = new File(".\\src\\monali\\coding_exam_20\\newFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line1 = "";
		String line = "";
		int maxcount = 0;

		while ((line1 = br.readLine()) != null) {
			int count = getWordCount(line1, "techno");
				if (count > maxcount) {
				maxcount = count;
				line = line1;
			}
		}
		System.out.println(line + " : " + maxcount);

		br.close();
	}

}
