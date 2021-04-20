/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.
*/
package shilpa.Assignment_24;

public class FindMiddleCharOfStr {
	void getMiddleCharOfStr(String[] str) {
		int middleChar = 0;
		for (int index1 = 0; index1 < str.length; index1++) {
			if (str[index1].length() % 2 == 0) {
				middleChar = (str[index1].length() / 2) - 1;
			} else {
				middleChar = (str[index1].length() / 2);
			}
			System.out.println("Middle Character of '" + str[index1] + "' is " + str[index1].charAt(middleChar));
		}
	}

	public static void main(String[] args) {
		FindMiddleCharOfStr findMiddleCharOfStr = new FindMiddleCharOfStr();
		String[] str = { "Techno", "Helpo", "Credits" };
		findMiddleCharOfStr.getMiddleCharOfStr(str);
	}
}
