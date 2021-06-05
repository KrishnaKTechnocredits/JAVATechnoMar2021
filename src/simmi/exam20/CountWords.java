/*Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2*/

/*Inputs in File(inputFile.txt): 
	Hi this is techno and Welcome to TechnoCredits.
	The techno batch 2021 started in march this year.
	This batch consists of 60 in total.*/

/*Inputs in File(ListOfWords.txt): 
	techno
	credits
	march
	batch*/

package simmi.exam20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CountWords {
	static int getEachWords(String input, String targetValue) {
		int count = 0;
		String[] arr = input.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		while (arrList.contains(targetValue)) {
			count++;
			arrList.remove(targetValue);
			
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File fileWords = new File(".\\src\\simmi\\exam20\\ListOfWordsFile.txt");
		BufferedReader brWord = new BufferedReader(new FileReader(fileWords));
		String word = " ";
		String line = " ";
		int targetValue = 0;
		while ((word = brWord.readLine()) != null) {
			File fileLine = new File(".\\src\\simmi\\exam20\\inputFile.txt");
			BufferedReader brLine = new BufferedReader(new FileReader(fileLine));
			{
				while ((line = brLine.readLine()) != null) {
					targetValue = targetValue + getEachWords(line, word);
				}
				System.out.println(word + " : " + targetValue);
				targetValue = 0;
				brLine.close();
			}
		}
		brWord.close();
	}
}
