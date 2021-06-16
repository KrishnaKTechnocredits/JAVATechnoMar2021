package aashay.Test_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FreqOfEachWordInFile {
	
	static int getFreqOfWord(String inputLine, String targetWord) {
		String[] lineArray = inputLine.split(" ");
		int cnt=0;
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(lineArray));
		while(list.contains(targetWord)) {
			list.remove(targetWord);
			cnt++;				
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		FreqOfEachWordInFile freqOfEachWordInFile = new FreqOfEachWordInFile();
		File file1 = new File(".\\src\\aashay\\Test_20\\ListOfWordFile.txt");
		File file2 = new File(".\\src\\aashay\\Test_20\\inputFile.txt");
		
		Scanner scan = new Scanner(file1);
		while(scan.hasNextLine()) {
			String targetWord = scan.nextLine();
			Scanner scanFile2 = new Scanner(file2);
			int cnt = 0;
			while(scanFile2.hasNextLine()) {
				String inputLine = scanFile2.nextLine();
				cnt = cnt + freqOfEachWordInFile.getFreqOfWord(inputLine, targetWord);
			}
			System.out.println(targetWord+" : "+cnt);
			scanFile2.close();
		}
		scan.close();
	}

}
