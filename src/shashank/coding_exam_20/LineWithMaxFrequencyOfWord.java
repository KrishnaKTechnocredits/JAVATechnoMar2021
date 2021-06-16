package shashank.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.

Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2

Note:  path -> .\\resources\\inputFile.txt, .\\resources\\ListOfWordFile.txt
*/

public class LineWithMaxFrequencyOfWord {

	public String getLineWithMaxFrequencyOfWord() throws IOException {
		File file = new File(
				"C:\\Users\\user\\Desktop\\Selenium Class\\New folder\\JAVATechnoMar2021\\src\\shashank\\coding_exam_20\\text1");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line1 = "", maxCountLine = "";
		int count = 0;
		int maxCount = 0;
		while ((line1 = br.readLine()) != null) {
			System.out.println(br.readLine());
			while (line1.contains("techno")) {
				count++;
				if (count > maxCount) {
					maxCount = count;
					maxCountLine = line1;
				}
			}
		}
		br.close();
		return maxCountLine;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LineWithMaxFrequencyOfWord lineWithMaxFrequencyOfWord = new LineWithMaxFrequencyOfWord();
		System.out.println("Line having maximum word as techno is below: ");
		System.out.println(lineWithMaxFrequencyOfWord.getLineWithMaxFrequencyOfWord());

	}
}