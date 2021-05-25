package madhavi_Raut.CodingExam.Exam_04;
/*Programming Test - 4 : 12th May'2021
String input 
= "Hi MAM hello NamaN techno";
output : MAM NamaN*/

public class FindPalindromeStrings {

	String getPalindromeString(String str) {
		String[] strArray = str.split(" ");
		String newString = "";
		for (int index = 0; index < strArray.length; index++) {
			String stringRev = "";
			for (int strIndex = strArray[index].length() - 1; strIndex >= 0; strIndex--) {
				stringRev += strArray[index].charAt(strIndex);
			}
			if (strArray[index].equalsIgnoreCase(stringRev)) {
				newString += stringRev + " ";
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println("Palindrome strings from given string is:");
		System.out.println(new FindPalindromeStrings().getPalindromeString("Hi MAM hello NamaN techno"));
	}

}
