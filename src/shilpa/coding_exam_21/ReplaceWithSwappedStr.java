/*Test 21
String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/
package shilpa.coding_exam_21;

public class ReplaceWithSwappedStr {
	String getUpdatedSwappedStr(String str1, String str2) {
		String[] stringArr = (str1.toLowerCase()).split(" ");
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer reverse = sb.reverse();
		String newString = "";
		for (String word : stringArr) {
			if (word.contains(str2.toLowerCase()))
				newString = newString + " " + word.replace(str2, reverse);
			else
				newString = newString + " " + word;
		}
		return newString;

	}

	public static void main(String[] args) {
		ReplaceWithSwappedStr replaceWithSwappedStr = new ReplaceWithSwappedStr();
		String outputString = replaceWithSwappedStr.getUpdatedSwappedStr("This is the Thread that given", "th");
		System.out.print("Updated String is :- ");
		System.out.println(outputString);
	}
}
