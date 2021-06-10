package aashay.Test_20;
/*
Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MaxFreqTechano {
	static String maxCountOfLine;
	void getLineWithMaxTargetWord(String inputLine, String targetWord) {
		int maxCountofWord =0;
		
		String checkInputLine = inputLine.trim();
		int countOfWord = 0;
		while(checkInputLine.contains(targetWord)) {
			countOfWord++;
			checkInputLine = checkInputLine.replaceFirst(targetWord,"*");
			//System.out.println(checkInputLine);		
		}
		if(maxCountofWord < countOfWord) {
			maxCountofWord = countOfWord;
			maxCountOfLine = inputLine;
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MaxFreqTechano maxFreqTechano = new  MaxFreqTechano();
		Scanner scan = new Scanner (new File(".\\src\\aashay\\Test_20\\inputFile.txt"));
		String targetWord = "techno";
		String currentLine = "";
		while(scan.hasNextLine()) {
			currentLine = scan.nextLine();
			maxFreqTechano.getLineWithMaxTargetWord(currentLine, targetWord);
			
		}
		System.out.println(maxCountOfLine);
		
		scan.close();

	}

}
