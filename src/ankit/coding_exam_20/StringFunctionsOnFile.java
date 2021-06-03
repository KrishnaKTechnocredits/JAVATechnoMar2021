//Program 1:  Return the line having max freq of word techno.


package ankit.coding_exam_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringFunctionsOnFile {
	 static String LineWithMaxTarget = "";
	 static int maxCount = 0;
	
	void  getLineWithMaxTarget(String line, String targetWord){
		String[] lineArr = line.split(" ");
		int countTargetWord = 0;
		ArrayList<String> lineAL = new ArrayList<String>(Arrays.asList(lineArr));
		while (lineAL.contains(targetWord)) {
			countTargetWord = countTargetWord+1;
			lineAL.remove(targetWord);	
		}
		if(countTargetWord > this.maxCount) {
			this.maxCount = countTargetWord;
			this.LineWithMaxTarget = line;
		}
	}
	
	 String displayMaxTargetWordString(){
		return this.LineWithMaxTarget;
	 }

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = ".\\src\\ankit\\coding_exam_20\\SampleFile.txt";
		String targetWord = "Ankit";
		Scanner sc = new Scanner(new File(filePath));
		StringFunctionsOnFile stringFunctionsOnFile = new StringFunctionsOnFile();
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			stringFunctionsOnFile.getLineWithMaxTarget(line, targetWord);
		}
		System.out.println(stringFunctionsOnFile.displayMaxTargetWordString());
		sc.close();
	}
}
