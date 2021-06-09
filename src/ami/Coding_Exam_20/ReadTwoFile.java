/*
 Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2
 */

package ami.Coding_Exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadTwoFile {

	static int getcount(String line, String word) {
		String[] input = line.split(" ");
		ArrayList<String> addGet = new ArrayList<String>(Arrays.asList(input));
		int count = 0;
		while (addGet.contains(word)) {
			addGet.remove(word);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scword = new Scanner(new File(".\\src\\ami\\Coding_Exam_20\\word.txt"));
		Scanner scLine = new Scanner(new File(".\\\\src\\\\ami\\\\Coding_Exam_20\\\\line.txt"));
		int count = 0;
		String word = "";
		String line = "";
		while (scword.hasNextLine()) {
			word = scword.nextLine();

			count = 0;
			while (scLine.hasNextLine()) {
				line = scLine.nextLine();
				count = count + getcount(line, word);
			}
			System.out.println(word + " " + count);
			//scLine.close();

		}
		//scword.close();
	}

}
