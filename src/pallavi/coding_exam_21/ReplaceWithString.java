package pallavi.coding_exam_21;

import java.util.ArrayList;
import java.util.Arrays;

/*String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/
public class ReplaceWithString {
	static String  getOutput(String input,String word) {
		String output="";
		String[] arr=input.split(" ");
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(arr));
		for(String currentWord:list) {
			if(currentWord.contains("Th")) {
				currentWord=currentWord.replace("Th","hT");
			}
			else if(currentWord.contains("th")) {
				currentWord=currentWord.replace("th", "ht");
			}
			
			output=output+currentWord+" ";
		}
		return output;
		
	}
	
	public static void main(String[] args) {
	String str1="This is the thread that given";
	String str2="th";
	String output=ReplaceWithString.getOutput(str1, str2);
	System.out.println(output.trim());
	}

}
