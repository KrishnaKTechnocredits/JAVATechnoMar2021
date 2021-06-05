/*
 rogram 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2
 */
package ravindra_J.coding_exam_20_FileReading;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class File2WordCount {

	static int getWordCount(String input, String word) {
		if (input.charAt(input.length() - 1) == '.')
			input = input.substring(0, input.length() - 1);
		int count = 0;
		String arr[] = input.split(" ");
		ArrayList<String> listofwords = new ArrayList<String>(Arrays.asList(arr));
		while (listofwords.contains(word)) {
			count++;
			listofwords.remove(word);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {

		File file1 = new File(".\\resources\\ListOfWordFile.txt");
		BufferedReader brword = new BufferedReader(new FileReader(file1));
		int result = 0;
		String line = "";
		String word = "";
		while ((word = brword.readLine()) != null) {
			File file = new File(".\\resources\\inputFile.txt");
			BufferedReader brline = new BufferedReader(new FileReader(file));
			while ((line = brline.readLine()) != null) {
				result = result + getWordCount(line, word);
			}
			System.out.println(word + "--" + result);
			result = 0;
			brline.close();
		}
		brword.close();
	}

}
