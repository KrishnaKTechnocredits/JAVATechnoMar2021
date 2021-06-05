package shivani.CodingExam_20;

//Return the line having max freq of word techno.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReturnMaxfrequency {

	static int getWordCount(String input, String targetWord) {

		String[] arr = input.split(" ");
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr));
		int count = 0;
		while (list1.contains(targetWord)) {
			list1.remove(targetWord);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(".\\resources\\inputFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		String maxLine = "";
		int count = 0;
		int maxcount = 0;
		while ((line = br.readLine()) != null) {
			count = getWordCount(line, "techno");
			if (maxcount < count) {
				maxcount = count;
				maxLine = line;
			}
		}
		br.close();
		System.out.println("Line having maximum count of word techno is");
		System.out.println(maxLine + " : " + count);
	}
}
