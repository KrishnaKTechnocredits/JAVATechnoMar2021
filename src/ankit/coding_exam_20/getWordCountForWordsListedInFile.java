/*
 * Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2

 * 
 */

package ankit.coding_exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class getWordCountForWordsListedInFile {

	static String getCountOfTagret(String line , String targetWord){
		int count = 0;
		String[] lineArr = line.split(" ");
		ArrayList<String> lineArrAL = new ArrayList<String>(Arrays.asList(lineArr));
		while(lineArrAL.contains(targetWord)) {
			count= count+1;
			lineArrAL.remove(targetWord);
		}
		return ("targetWord :"+targetWord+ "--> Count :"+ count);
	} 

	public static void main(String[] args) throws FileNotFoundException {
		String inputFilePath = "./src/ankit/coding_exam_20/SampleFile.txt";
		String wordListFilePath = "./src/ankit/coding_exam_20/wordList.txt";
		Scanner scInputFile = new Scanner(new File(inputFilePath));

		while(scInputFile.hasNext()) {
			String line = scInputFile.nextLine();
			System.out.println("For Target Line  :"+ line);
			Scanner scWordFile = new Scanner(new File(wordListFilePath));//seperate method
			while(scWordFile.hasNext()){
				String targetWord = scWordFile.nextLine();
				System.out.println(getCountOfTagret(line , targetWord));
			}
			scWordFile.close();
		}
		scInputFile.close();
	}	
}
