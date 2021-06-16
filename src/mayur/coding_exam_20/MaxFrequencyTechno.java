package mayur.coding_exam_20;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MaxFrequencyTechno {

	String getMaxFrequencyTechno(String word) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(".\\src\\mayur\\coding_exam_20\\Techno.txt"));
		int countMax = 0;
		String strLine = "";
		while (sc.hasNextLine()) {
			int count = 0;
			String line = sc.nextLine();
			String originalLine = line;
			while (line.contains(word)) {
				count++;
				line = line.replaceFirst(word, "");
			}
			if (count > countMax) {
				countMax = count;
				strLine = originalLine;
			}
		}
		sc.close();
		return strLine;
	}

	public static void main(String[] args) throws IOException {

		MaxFrequencyTechno max = new MaxFrequencyTechno();
		System.out.println("The line having Techno with maximum frequency is: " + max.getMaxFrequencyTechno("techno"));
	}
}
