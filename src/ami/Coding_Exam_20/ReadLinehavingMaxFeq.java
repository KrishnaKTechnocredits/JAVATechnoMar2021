/*
 Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.
 */

package ami.Coding_Exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadLinehavingMaxFeq {

	static int getCount(String input, String tName) {
		String[] word = input.split(" ");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(word));
		int count = 0;
		while (list.contains(tName)) {
			list.remove(tName);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(".\\src\\ami\\Coding_Exam_20\\example1.txt"));

		String line1 = "";
		int maxcount = 0;

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			int count = getCount(line, "hii");
			if (count > maxcount) {
				maxcount = count;
				line1 = line;
			}
		}
		System.out.println(line1 + " : " + maxcount);

	}

}
