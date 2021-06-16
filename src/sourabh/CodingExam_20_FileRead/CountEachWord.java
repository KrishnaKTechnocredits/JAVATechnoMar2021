/*
Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2

Note:  path -> .\\resources\\inputFile.txt, .\\resources\\ListOfWordFile.txt
 */

package sourabh.CodingExam_20_FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountEachWord {
	static int getCountWord(String strInput, String targetStr) {
		String[] arr= strInput.split(" ");
		int count=0;
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(arr));
		while(al.contains(targetStr)) {
			count++;
			al.remove(targetStr);
		}
			
		return count;
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(".\\src\\sourabh\\CodingExam_20_FileRead\\ListOfWordFile.txt"));
		while (sc.hasNext()) {
			int count=0;
			String word = sc.nextLine();
			Scanner sc1 = new Scanner(new File(".\\src\\sourabh\\CodingExam_20_FileRead\\inputFile.txt"));
			while (sc1.hasNext()) {
				String line = sc1.nextLine();
				count=count+ getCountWord(line, word);
				
			}
			System.out.println(word+" : "+count);
			sc1.close();
		}
		sc.close();
	}
}
