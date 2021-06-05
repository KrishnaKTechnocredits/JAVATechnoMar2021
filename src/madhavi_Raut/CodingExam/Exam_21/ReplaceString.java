package madhavi_Raut.CodingExam.Exam_21;
/*String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given*/

public class ReplaceString {

	String getNewString(String str, String word) {
		String newStr = str.toLowerCase();
		String wordToSearch = word.toLowerCase();
		while (newStr.contains(wordToSearch)) {
			int i = newStr.indexOf(wordToSearch);
			StringBuffer sb = new StringBuffer(String.valueOf(str.charAt(i) + String.valueOf(str.charAt(i + 1))));
			String wordRev = sb.reverse().toString();
			newStr = newStr.replaceFirst(wordToSearch, wordRev);
		}
		return newStr;
	}

	public static void main(String[] args) {
		String str = "This is the thread that given";
		String word = "th";
		System.out.println(new ReplaceString().getNewString(str, word));
	}
}
