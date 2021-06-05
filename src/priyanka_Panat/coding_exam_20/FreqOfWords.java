/*
 Test - 20 : 3rd Jun'2021
Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2

Note:  path -> .\\resources\\inputFile.txt, .\\resources\\ListOfWordFile.txt 
 */
package priyanka_Panat.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FreqOfWords {
	static int getFreqOfWord(String input, String targetWord) {
		String[] inputArr = input.split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(inputArr));
		int count = 0;
		while (listOfWords.contains(targetWord)) {
			listOfWords.remove(targetWord);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File file1 = new File(".\\resources\\ListOfWordFile.txt"); 
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		File file2 = new File(".\\resources\\inputFile.txt");
		String word = " ";
		String line = " ";
		while ((word = br1.readLine()) != null) {
			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			int count = 0;
			while ((line = br2.readLine()) != null) {
				count += getFreqOfWord(line, word);
			}
			System.out.println(word + " : " + count);
		}
		br1.close();
	}
}
