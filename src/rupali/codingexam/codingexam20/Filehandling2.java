/*
 * Program 2:  find freq of each word from ListOfWordFile to inputFile.
output:  techno -> 2
             credits -> 0.
             march -> 1
             batch -> 2
 */
package rupali.codingexam.codingexam20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Filehandling2 {

	HashMap<String,Integer> getWordCount(String line) {
		String[] arr=line.split(" ");
		HashMap<String,Integer> wc=new HashMap<String,Integer>();
		int count=0,i=0;
		for( i=0;i<arr.length;i++) {
			count=0;
			for(int j=i;j<arr.length;j++) {
			if(arr[i].contains(arr[j]))
				count++;
			}
			wc.put(arr[i], count);				
		}
		return wc;
	}
	public static void main(String[] args) throws IOException {
		Filehandling2 filehandling2=new Filehandling2();
		File fp1=new File(".//src/rupali/codingexam/codingexam20/Smple.txt");
		
		String line="";
		BufferedReader br=new BufferedReader(new FileReader(fp1));
		
		while((line=br.readLine())!=null){
		HashMap<String,Integer> hs=filehandling2.getWordCount(line);
		System.out.println("Word count for line '"+line+"' is:"+hs);
		}
		br.close();
	}
}
