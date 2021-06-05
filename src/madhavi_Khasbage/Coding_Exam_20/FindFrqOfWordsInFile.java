package madhavi_Khasbage.Coding_Exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2
*/
public class FindFrqOfWordsInFile {

	int getWordFrequencyCount(String strLine, String targetword) {
		int count = 0;
		String[] arr = strLine.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		while (arrList.contains(targetword)) {
			arrList.remove(targetword);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		FindFrqOfWordsInFile objFile = new FindFrqOfWordsInFile();
		File file1 = new File(".\\resources\\ListOfWordFile.txt");
		BufferedReader brWord = new BufferedReader(new FileReader(file1));
		String line1 = "", word1 = "";
		int count = 0;
		while ((word1 = brWord.readLine()) != null) {
			File file = new File(".\\resources\\inputFile.txt");
			BufferedReader brLine = new BufferedReader(new FileReader(file));
			while ((line1 = brLine.readLine()) != null) {
				count = count + objFile.getWordFrequencyCount(line1, word1);
			}
			System.out.println(word1 + ":" + count);
			count = 0;
		}
		brWord.close();
	}
}
