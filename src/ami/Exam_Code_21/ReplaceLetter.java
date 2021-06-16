/*
 Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
 */

package ami.Exam_Code_21;

public class ReplaceLetter {
	
	static String letterReplce (String str1 , String str2) {
		String[] array = (str1.toLowerCase()).split(" ");
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer rvs = sb.reverse();
		String newstr = "";
		
		for(String word : array) {
			if(word.contains(str2.toLowerCase())) 
				newstr = newstr + " " + word.replace(str2, rvs);
			else
				newstr = newstr + " " + word;
		}
		return newstr;
	}
	
	public static void main(String[] args) {
		String str1 = "This is the thread that given";
		String str2 = "th";
		String output = letterReplce(str1, str2);
		System.out.println("output : " + output);
	}

}
