/*Program 1:  Return the line having max freq of word techno.*/
package shilpa.coding_exam_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LineWithMaxFreqFromFile {
	int getWordCntFromEachLine(String inputLine, String targetWord) {
		String[] lineArr = inputLine.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(lineArr));
		int cnt = 0;
		while (list.contains(targetWord)) {
			list.remove(targetWord);
			cnt++;
		}
		return cnt;
	}

	String getMaxCount() throws IOException {
		File file = new File(".\\src\\shilpa\\coding_exam_20\\file1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line1 = "";
		int maxcnt = 0;
		String lineWithMaxCnt = "";
		while ((line1 = br.readLine()) != null) {
			int cnt = getWordCntFromEachLine(line1, "techno");
			if (cnt > maxcnt) {
				maxcnt = cnt;
				lineWithMaxCnt = line1;
			}
		}
		return lineWithMaxCnt + " -> " + maxcnt;
	}

	public static void main(String[] args) throws IOException {
		LineWithMaxFreqFromFile lineWithMaxFreqFromFile = new LineWithMaxFreqFromFile();
		String lineWithMaxCnt = lineWithMaxFreqFromFile.getMaxCount();
		System.out.println("line having max frequency of word 'techno' from file :\n");
		System.out.println(lineWithMaxCnt);
	}
}
