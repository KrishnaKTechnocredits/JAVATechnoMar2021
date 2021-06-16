/*
Coding_Exam_20

Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.

 */

package sourabh.CodingExam_20_FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindLineHaveMaxFreq {
	static int getWordCount(String strInput, String targetStr) {
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
		int maxCount=0;
		String maxLine= "";
		Scanner sc= new Scanner(new File(".\\src\\sourabh\\CodingExam_20_FileRead\\file2.txt"));
		while(sc.hasNext()) {
			String line= sc.nextLine();
			//System.out.println(line);
			int count= getWordCount(line, "techno");
			//System.out.println(line+":"+count);
			if(count>maxCount) {
				maxLine= line;
				maxCount=count;
			}
		}
		System.out.println("Max line: "+maxLine);
		System.out.println("Max count techno: "+maxCount);
		sc.close();
	}
	
}
