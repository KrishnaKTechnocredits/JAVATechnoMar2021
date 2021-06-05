/*String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given*/

package sangeeta.CodingExam;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingExam21 {
	
	String modifyString(String str1, String str2) {
		String output = "";
		String [] strarr = (str1.toLowerCase()).split(" ");
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer reversedString = sb.reverse();
		for(String word : strarr) {
			if(word.contains(str2))
				output = output + " " + word.replace(str2, reversedString);
			else
				output = output + " " + word;		
		}
		return output;
	}
	
	public static void main(String[] args) {
		CodingExam21 codingExam21 = new CodingExam21();
		String str1 = "This is the thread that given";
		String str2 = "th";
		String outputString = codingExam21.modifyString(str1, str2);
		System.out.println("New string after swapping is: "+outputString);
	}

}
