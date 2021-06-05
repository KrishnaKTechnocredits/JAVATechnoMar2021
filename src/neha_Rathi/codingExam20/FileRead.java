package neha_Rathi.codingExam20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {

	int findCount(String line, String targetWord) {
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
		FileRead f = new FileRead();
		Scanner sc = new Scanner(new File("D:\\ProgramTechno\\JAVATechnoMar2021\\src\\neha_Rathi\\codingExam20\\test.txt"));
		String line = "";
		String line1 = "";
		int maxCount = 0;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			f.findCount(line, "techno");
			if (f.findCount(line, "techno") > maxCount) {
				maxCount = f.findCount(line, "techno");
				line1=line;
			}
		}
		System.out.println(maxCount + " :: " + line1);
	}
}
