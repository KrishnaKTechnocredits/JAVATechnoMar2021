package pallavi.coding_exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWordFromFile {
	static int max = 0;

	static int getCount(String str, String word) {
		int count = 0;
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].equals(word))
				count++;
		}

		return count;
	}

	public static void main(String[] args) throws FileNotFoundException {
		String output = "";
		int count = 0;
		Scanner sc = new Scanner(new File(".\\src\\pallavi\\coding_exam_20\\input.txt"));
		String target = "techno";
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			count = CountWordFromFile.getCount(line, target);
			if (max < count) {
				max = count;
				output = line;
			}
		}
		System.out.println("String having maximum count  -->" + output);
		System.out.println(target + " -->" + max);
	}

}
