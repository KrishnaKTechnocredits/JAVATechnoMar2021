/*
Test - 20 : 3rd Jun'2021
Program 1: Return the line having max freq of word techno.
 */
package radha.CodingTest20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LineWithMaxFreq {
	
	static int getMaxFrequncyCount(String str, String word) {
		if(str.charAt(str.length()-1)=='.')
			str= str.substring(0, str.length()-1);
		int count=0;
		String[] wordsArr = str.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(wordsArr));
		while(al.contains(word)) {
			al.remove(word);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\radha\\CodingTest20\\MaxfreqInputfile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line="", maxFreqLine="";
		int maxCount=0;
		while((line=br.readLine())!=null) {
			int count = getMaxFrequncyCount(line, "techno");
			if(count > maxCount) {
				maxCount = count;
				maxFreqLine = line;
			}
		}
		System.out.println("Line having maximum frequency of techno is:\n"+maxFreqLine+" - "+maxCount);	
	}
}