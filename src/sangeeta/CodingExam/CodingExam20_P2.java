/*find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2

Note:  path -> .\\resources\\inputFile.txt, .\\resources\\ListOfWordFile.txt*/

package sangeeta.CodingExam;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodingExam20_P2 {

	static int getFreqOfWords(String input, String targetWord) {
		String[] arr = input.split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(arr));
		int count = 0;
		while (listOfWords.contains(targetWord)) {
			listOfWords.remove(targetWord);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		File file1 = new File(".\\src\\sangeeta\\CodingExam\\file1.txt");
		File file2 = new File(".\\src\\sangeeta\\CodingExam\\file2.txt");
		Scanner sc2 = new Scanner(new FileReader(file2));
		String line1 = "";
		String word = "";
		int count = 0;
		while (sc2.hasNextLine()) {
			word = sc2.nextLine();
			Scanner sc1 = new Scanner(new FileReader(file1));
			count = 0;
			while (sc1.hasNextLine()) {
				line1 = sc1.nextLine();
				count = count + getFreqOfWords(line1, word);
			}
			System.out.println(word + " : " + count);
			sc1.close();
		}
		sc2.close();
	}
}
