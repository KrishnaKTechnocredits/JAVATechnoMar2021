/*
Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/

package sandesh.coding_exam_21;

public class StringManipulationhTis {

	private String getManipulatedString(String inpStr) {
		inpStr = inpStr.trim();
		String[] arrayStr = inpStr.split(" ");
		String out = "";
		for (int index = 0; index < arrayStr.length; index++) {
			if (arrayStr[index].charAt(1) == 'h' || arrayStr[index].charAt(1) == 'H') {
				char ch = arrayStr[index].charAt(1);
				arrayStr[index] = arrayStr[index].replace(String.valueOf(ch), "");
				out += String.valueOf(ch) + arrayStr[index] + " ";
			} else
				out += arrayStr[index] + " ";
		}
		return out;
	}

	public static void main(String[] args) {
		String input = "This is the tHread tHat given";
		String output = new StringManipulationhTis().getManipulatedString(input);
		System.out.println(output);
	}
}