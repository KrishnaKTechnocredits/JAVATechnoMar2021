/*
 * Coding_Exam_20

Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.

Program 2:  find freq of each word from ListOfWordFile to inputFile.
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

public class Filehanding1 {
	int getMaxWordCount(String line,String targetstr) {
		String[] arr=line.split(" ");
		int count=0,i=0;
		while(i<arr.length) {
			if(arr[i].contains(targetstr))
				count++;
			i++;
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		Filehanding1 filehanding1=new Filehanding1();
		File fp=new File(".//src/rupali/codingexam/codingexam20/Smple.txt");
		
		String line="",maxline="";
		int count=0,maxcount=0;
		BufferedReader br=new BufferedReader(new FileReader(fp));
		
		while((line=br.readLine())!=null) {
			count=filehanding1.getMaxWordCount(line,"techno");
			if(maxcount<count) {
				maxcount=count;
				maxline=line;
			}
		}
		
		br.close();
		System.out.println("Line which contains 'techno' word maxinum time is: "+maxline);
	}
}


