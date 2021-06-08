package kangan.Coding.Exam20;

//Return the line having max freq of word kangan.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReturnLine {

	static int getWordCount(String line, String target) {
		if(line.charAt(line.length()-1)=='.')
			line=line.substring(0, line.length()-1);
		String input[] = line.split(" ");
		ArrayList<String> newList = new ArrayList<String> (Arrays.asList(input));
		int count = 0;
		//try enhanced for loop also
		  while(newList.contains(target)) {
			  newList.remove(target);
			  count++;
			  }
		 
		//replace, .equals,enhanced for loop also work
		//for(int index=0;index<input.length;index++) {
		//	if(input[index]==target);
		//	count++;}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\kangan\\Coding\\Exam20\\WordFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line1 = "";
		String maxLine="";
		int max = 0;
		while((line1=br.readLine())!=null) {
			//line1 = br.readLine();
			int cnt = getWordCount(line1,"kangan");
			System.out.println(line1 + " " +cnt);
			if(cnt>max) {
				max=cnt;
				maxLine=line1;
			}
		}
		System.out.println(maxLine  + " : contains max target word : " +max);
		
		br.close();
	}
}
