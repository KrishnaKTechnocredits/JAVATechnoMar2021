package madhavi_Raut.CodingExam.Exam20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Program 1:  Return the line having max freq of word techno.

public class FindLineHavingMaxFreqOfGivenWord {

	String getLineHavingMaxFrequencyOfGivenWord(String str) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(
				"D:\\Mady_JavaSeleniumBatch\\JAVATechnoMar2021\\src\\madhavi_Raut\\CodingExam\\Exam20\\inputFile.txt"));
		int countMax = 0;
		String strLine = "";
		while (scanner.hasNextLine()) {
			int count = 0;
			String line = scanner.nextLine();
			String originalLine = line;
			while (line.contains(str)) {
				count++;
				line = line.replaceFirst(str, "*");
			}
			if (count > countMax) {
				countMax = count;
				strLine = originalLine;
			}
		}
		scanner.close();
		return strLine;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Line having maximum frequency of given word: "+new FindLineHavingMaxFreqOfGivenWord().getLineHavingMaxFrequencyOfGivenWord("techno"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
