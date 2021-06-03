/*Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.*/

/*Inputs in File(Line.txt): 
	Hi Techno hello Techno Techno Techno Techno Techno Techno Techno Techno
	TechnoCredits TechnoHello Techno Techno Techno Techno Techno Techno Techno
	Hi Hello TechnoCredits Techno Techno Techno */

package simmi.exam20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MaxFreqLine {
	static int getMaxLine(String input, String targetWord) {
		int maxCount = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].equals(targetWord))
				maxCount++;
		}
		return maxCount;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\simmi\\exam20\\Line.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = " ";
		int count = 0;
		int maxCount = 0;
		String maxLine = " ";
		while ((line = br.readLine()) != null) {

			maxCount = getMaxLine(line, "Techno");
			if (maxCount > count)
				maxLine = line;
			count = maxCount;
		}
		System.out.println(maxLine);
		br.close();
	}

}
