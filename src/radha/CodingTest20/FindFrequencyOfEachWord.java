/*
Program 2: find freq of each word from ListOfWordFile to inputFile.
output: techno -> 2
credits -> 0.
march -> 1
batch -> 2

 */
package radha.CodingTest20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindFrequencyOfEachWord {
	
	static int getMaxFrequncyCount(String str, String word) {
		if(str.charAt(str.length()-1)=='.')
			str= str.substring(0, str.length()-1);
		int count=0;
		String[] wordsArr = str.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(wordsArr));
		while(al.contains(word)) {
			al.remove(word);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		File file1 = new File(".\\src\\radha\\CodingTest20\\inputFile.txt");
		File file2 = new File(".\\src\\radha\\CodingTest20\\listOfWords.txt");
		
		Scanner scListOfWords = new Scanner(file2); 
		while(scListOfWords.hasNextLine()) {
			String word = scListOfWords.nextLine();
			Scanner scInputLine = new Scanner(file1);
			int count=0;
			while(scInputLine.hasNext()) {
				String line = scInputLine.nextLine();
				count = count+ getMaxFrequncyCount(line, word);
			}
			System.out.println(word+ " : "+ count);
			scInputLine.close();
		}
		scListOfWords.close();
	}
}