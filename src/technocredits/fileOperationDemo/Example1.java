package technocredits.fileOperationDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

	static int getWordCount(String input, String targetWord) {
		if(input.charAt(input.length()-1) == '.')
			input = input.substring(0, input.length()-1);
		String[] arr = input.split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(arr));
		int count = 0;
		while(listOfWords.contains(targetWord)) {
			listOfWords.remove(targetWord);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\technocredits\\fileOperationDemo\\file1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line1 = "";
		while((line1 = br.readLine()) != null) {
			int count = getWordCount(line1, "techno");
			System.out.println(line1 + " : " + count);
		}
		br.close();
	}
}
