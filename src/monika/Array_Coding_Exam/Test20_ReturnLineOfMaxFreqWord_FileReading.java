package monika.Array_Coding_Exam;
/*Program 1:  Return the line having max freq of word techno.*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test20_ReturnLineOfMaxFreqWord_FileReading {

	private static int getCountOfGivenWord(String line, String word) {
		int count = 0 ;
		while(line.contains(word)) {
			count++;
			line = line.replaceFirst(word, "");
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Monika.Kaul\\Desktop\\TechnoCredits\\JAVATechnoMar2021\\resources\\inputFile.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String s = "";
		String tempString = "";
		int tempCount = 0;
		while((s = br.readLine()) != null) {
			int count = getCountOfGivenWord(s, "techno");
			if(count > tempCount) {
				tempCount = count;
				tempString = s;
			}
		} System.out.println("Count = "+tempCount+ " : "+tempString);
	}
}
