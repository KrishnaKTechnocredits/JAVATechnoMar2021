/*
Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.

*/
package priyanka_Panat.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LineWithMaxFreqOfWord {
	static int getWordCount(String input, String targetWord) {
		/*
		 * if(input.charAt(input.length()-1) == '.') input = input.substring(0,
		 * input.length()-1);
		 */
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
