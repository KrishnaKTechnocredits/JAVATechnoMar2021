/*
 Test - 20 : 3rd Jun'2021
Program 1: Return the line having max freq of word techno.
Note: path -> .\\resources\\inputFile.txt, .\\resources\\ListOfWordFile.txt
 */

package upasana.coding_exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileMaxFreq {

	int getMaxFreq(String line, String word) {

		int count = 0;

		if (line.charAt(line.length() - 1) == '.') {
			line = line.substring(0, line.length() - 1);
		}
		String[] arr = line.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		while (list.contains(word)) {
			list.remove(word);
			count++;
		}
		return count;

	}

	public static void main(String[] args) throws FileNotFoundException {

		int max = 0;

		String word = "techno";
		String line1 = "";
		Scanner sc = new Scanner(new File(".\\src\\upasana\\coding_exam_20\\file1.txt"));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			int count = new FileMaxFreq().getMaxFreq(line, word);
			if (count > max) {
				max = count;
				line1 = line;
			}
			
		}
		System.out.println(line1  +" --> " + max);

	}

}
