package surabhi.coding_exam20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxWordlineFromFile {
	static int getMaxWordCount(String str, String target) {
		String[] arr=str.split(" ");
		int count=0;
		ArrayList<String> al=new ArrayList(Arrays.asList(arr));
		while(al.contains(target)) {
			al.remove(target);
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0, maxCount=0;
		String targetWord="Techno";
		String line="",maxLine="";
		File file =new File(".\\src\\surabhi\\coding_exam20\\File1.txt");
		BufferedReader br  =new BufferedReader(new FileReader(file));
		while(br.ready()) {
			line=br.readLine();
			count=getMaxWordCount(line,targetWord);
			if(maxCount<count) {
				maxCount=count;
				maxLine=line;
			}	
		}
		br.close();
		System.out.println("Maximum count of word"+ targetWord+" line is :\n"+maxLine+ "\ncount is :"+maxCount);

	}

}
