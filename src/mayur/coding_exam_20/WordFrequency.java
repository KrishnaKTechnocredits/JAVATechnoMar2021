package mayur.coding_exam_20;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WordFrequency {

	static int getWordFrequency(String input, String word) {
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
		File file1 = new File(".\\src\\mayur\\coding_exam_20\\Wordfrequency.txt");
		BufferedReader words = new BufferedReader(new FileReader(file1));
		int result = 0;
		String line = "";
		String word = "";
		while ((word = words.readLine()) != null) {
			File file = new File(".\\src\\mayur\\coding_exam_20\\Techno.txt");
			BufferedReader input = new BufferedReader(new FileReader(file));
			while ((line = input.readLine()) != null) {
				result = result + getWordFrequency(line, word);
			}
			System.out.println(word + "-" + result);
			result = 0;
			input.close();
		}
		words.close();
	}

} 
