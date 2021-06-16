/*
 Program 2: find freq of each word from ListOfWordFile to inputFile.
output: 
techno -> 5
credits -> 0.
march -> 2
batch -> 2
 */

package upasana.coding_exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileFrequOfEachWord {
	int getFreq(String line, String word) {
		int count = 0;
		if (line.charAt(line.length() - 1) == '.') {
			line = line.substring(0, line.length() - 1);
		}
		String[] arr = line.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		while (list.contains(word)) {
			list.remove(word);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(".\\src\\upasana\\coding_exam_20\\ListOfWordFile.txt"));
		while (sc.hasNext()) {
			int count = 0;
			String word = sc.nextLine();
			System.out.print(word + " : ");
			Scanner sc1 = new Scanner(new File(".\\src\\upasana\\coding_exam_20\\inputFile.txt"));
			while (sc1.hasNext()) {
				String line = sc1.nextLine();
				count += new FileFrequOfEachWord().getFreq(line, word);
			}
			System.out.println(count);
			sc1.close();
		}
		sc.close();
	}
}
