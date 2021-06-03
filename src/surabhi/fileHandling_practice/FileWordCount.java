package surabhi.fileHandling_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileWordCount {
	static int getWordCount(String str) {
		String arr[]=str.split(" ");
		int count=0;
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		while(al.contains("Surabhi")) {
			al.set(al.indexOf("Surabhi"), "*");
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File(".\\src\\surabhi\\fileHandling_practice\\SampleFile1.txt");
		FileReader fReader=new FileReader(file);
		BufferedReader br=new BufferedReader(fReader);
		while((br.ready())) {
			int count=getWordCount(br.readLine());
			System.out.println("Word count - Surabhi in single line :"+ count);
		}
		
	}

}
