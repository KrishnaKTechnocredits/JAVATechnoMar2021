package madhavi_Khasbage.ArrayPrograms;

/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d
*/

public class FingMiddleCharOfStr {

	String getMidCharString(String[] arrStr) {
		String midChar = "";
		char ch;
		int indx1;
		for (int index = 0; index < arrStr.length; index++) {
			int strLength = arrStr[index].length();
			indx1 = strLength / 2;
			if (strLength % 2 == 0) {
				indx1 = indx1 - 1;
			}
			ch = arrStr[index].charAt(indx1);
			if (midChar != "")
				midChar += ",";
			midChar += ch;
		}
		return midChar;
	}

	public static void main(String[] args) {
		FingMiddleCharOfStr charOfStr = new FingMiddleCharOfStr();
		String[] arr = { "Techno", "Hello", "Credits"};
		System.out.println(charOfStr.getMidCharString(arr));
	}
}
