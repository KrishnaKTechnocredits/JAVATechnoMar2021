/*
 Program 1:  Return the line having max freq of word techno.
 */
package ravindra_J.coding_exam_20_FileReading;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WordHavingMaxFrq {
	static int maxFrqWordLine(String input, String word) {
		int count = 0;
		if (input.charAt(input.length() - 1) == '.')
			input = input.substring(0, input.length() - 1);
		String arr[] = input.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		while (list.contains(word)) {
			count++;
			list.remove(word);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {

		File file = new File(".\\resources\\inputFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		int max = 0;
		int index = 1;
		String line = "";
		while ((line = br.readLine()) != null) {
			int wordCount = maxFrqWordLine(line, "techno");
			if (index == 1) {
				max = wordCount;
			}
			if (max < wordCount) {
				System.out.println(line + "\nfrequency of word techno in line is : -> " + wordCount);
				max = wordCount;
			}
			index++;
		}
		br.close();
	}
}
