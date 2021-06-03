package surabhi.coding_exam20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FilesUsing2inputFiles {
	static int getCount(String str, String word) {
		String[] arr=str.split(" ");
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		int count=0;
		while(al.contains(word)) {
			count++;
			al.remove(word);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1=new File(".\\resources\\ListOfWordFile.txt");
		BufferedReader br1=new BufferedReader(new FileReader(file1));
		File file2=new File(".\\resources\\inputFile.txt");
		
		String word="";
		int count=0;
		while(br1.ready()) {
			BufferedReader br2=new BufferedReader(new FileReader(file2));
			word=br1.readLine();
			while(br2.ready()) {
				count=count+getCount(br2.readLine(), word);
			}
			System.out.println("Word count for "+ word+" is :"+count);
			count=0;
			if(!br1.ready()) {
				br2.close();
			}
		}
		br1.close();
	}

}
