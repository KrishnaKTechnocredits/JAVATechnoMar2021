package madhavi_Khasbage.Coding_Exam_20;

/*Test - 20 : 3rd Jun'2021
Program 1:  Return the line having max freq of word techno.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReadingExaple1 {

	int getMaxFrqLine(String strLine, String targetword) {
		
		strLine = strLine.substring(0, strLine.length()-1);
		int count = 0;
		String[] arr = strLine.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		while (arrList.contains(targetword)) {
			arrList.remove(targetword);
			count++;
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		FileReadingExaple1 objFile = new FileReadingExaple1();
		File file = new File(".\\resources\\inputFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String strLine = "";
		int temp = 0;
		int count = 0, index=1;
		
		while ((strLine = br.readLine()) != null) {
			count = objFile.getMaxFrqLine(strLine, "techno");
			if(index==1) {temp=count;}			
			if (count > temp) {
				System.out.println(strLine + ">> " + count);				
				temp = count;
			}
			index++;
		}
	}
}
