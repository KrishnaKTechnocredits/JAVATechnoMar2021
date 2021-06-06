package pallavi.coding_exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadEachWordFromFile {

	static int getCount(String input, String word) {
		int count = 0;
		String[] arr = input.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		while (list.contains(word)) {
			list.remove(word);
			count++;
		}
		return count;

	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc1 = new Scanner(new File(".\\src\\pallavi\\coding_exam_20\\ListOfWordFile.txt"));
		while (sc1.hasNext()) {
			int count = 0;
			String str = sc1.nextLine();
			Scanner sc = new Scanner(new File(".\\src\\pallavi\\coding_exam_20\\inputFile.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				count = count + ReadEachWordFromFile.getCount(line, str);
			}
			System.out.println(str + "-->" + count);

			sc.close();
		}
		sc1.close();
	}

}
