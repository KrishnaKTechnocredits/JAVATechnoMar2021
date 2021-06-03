package madhavi_Raut.CodingExam.Exam20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2   credits -> 0  march -> 1 batch -> 2*/

public class FindFreqOfWordFromFile {

	HashMap<String, Integer> getFreqOfWord() throws FileNotFoundException {
		HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		Scanner scannerWord = new Scanner(new File(
				"D:\\Mady_JavaSeleniumBatch\\JAVATechnoMar2021\\src\\madhavi_Raut\\CodingExam\\Exam20\\ListOfWordFile.txt"));
		while (scannerWord.hasNext()) {
			String word = scannerWord.nextLine();
			boolean flag = false;
			Scanner scannerFile = new Scanner(new File(
					"D:\\Mady_JavaSeleniumBatch\\JAVATechnoMar2021\\src\\madhavi_Raut\\CodingExam\\Exam20\\inputFile.txt"));
			while (scannerFile.hasNext()) {
				String line = scannerFile.nextLine();
				String[] strArr = line.split(" ");
				for (String str : strArr) {
					if (str.equalsIgnoreCase(word)) {
						if (hm.containsKey(word)) {
							hm.put(word, hm.get(word) + 1);
						} else {
							hm.put(word, 1);
							flag = true;
						}

					}

				}
			}
			if (!flag)
				hm.put(word, 0);
			scannerFile.close();
		}
		scannerWord.close();
		return hm;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Frequency of listed words in given file: "+new FindFreqOfWordFromFile().getFreqOfWord());
	}
}
