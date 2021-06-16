/*
Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
 */

package sourabh.CodingExam_21_replaceExp;

public class StringReplace {
	String getOutput(String str1) {
		if (str1.contains("Th") && str1.contains("th")) {
			str1 = str1.replace("th", "ht");
			str1 = str1.replace("Th", "hT");
		}
		return str1;
	}

	public static void main(String[] args) {
		StringReplace stringReplace = new StringReplace();
		String output= stringReplace.getOutput("This is the thread that given");
		System.out.println(output);
	}

}
