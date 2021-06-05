package neha_Rathi.codingExam20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead1 {
	int findCount1(String line, String targetWord) {
		String[] lineArr = line.split(" ");
		int countTargetWord = 0;
		ArrayList<String> lineAL = new ArrayList<String>(Arrays.asList(lineArr));
		while (lineAL.contains(targetWord)) {
			countTargetWord++;
			lineAL.remove(targetWord);
		}
		return countTargetWord;
	}

	public static void main(String[] args) throws FileNotFoundException {

		FileRead1 f1 = new FileRead1();
		Scanner sc = new Scanner(new File("D:\\ProgramTechno\\JAVATechnoMar2021\\src\\neha_Rathi\\codingExam20\\test1.txt"));
		String word = "";
		String line1 = "";
		while (sc.hasNextLine()) {
			int maxCount = 0;
			word = sc.nextLine();
			Scanner sc1 = new Scanner(new File("D:\\ProgramTechno\\JAVATechnoMar2021\\src\\neha_Rathi\\codingExam20\\test.txt"));
			while (sc1.hasNextLine()) {
				line1 = sc1.nextLine();
				maxCount += f1.findCount1(line1, word);
			}
			System.out.println(word + " :: " + maxCount);
		}
	}
}
