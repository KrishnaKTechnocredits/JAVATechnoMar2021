package monika.Array_Coding_Exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2*/

public class Test20_ReturnFreqOfEachWordBetween2Files_FileReading {

	static int getCountOfWord(String word) throws IOException {
		int count = 0;
		File file2 = new File(".\\resources\\inputFile.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		String line = "";
		while ((line = br2.readLine()) != null) {
			while (line.contains(word)) {
				count++;
				line = line.replaceFirst(word, "");
			}
		}
		return count;
	}

	static LinkedHashMap<String, Integer> getAllCountOfWord() throws IOException {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		File file1 = new File(".\\resources\\ListOfWordFile.txt");
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		String word = "";
		while (((word = br1.readLine()) != null)) {
			int count = getCountOfWord(word);
			hm.put(word, count);
		}
		return hm;
	}

	public static void main(String[] args) throws IOException {
		LinkedHashMap<String, Integer> hm = getAllCountOfWord();
		System.out.println(hm);
	}

}