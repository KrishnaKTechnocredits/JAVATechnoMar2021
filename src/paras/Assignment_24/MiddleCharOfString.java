/*
Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d
Note: for name having even length, consider length/2-1 index is middle character.
*/

package paras.Assignment_24;

public class MiddleCharOfString {
	
	void getMiddleCharOfStr(String[] str) {
		int midChar = 0;
		for(int index = 0; index < str.length ; index++) {
			if(str[index].length() % 2 == 0) {
				midChar = (str[index].length() / 2 -1);
			} else {
				midChar = (str[index].length() / 2);
			}
			System.out.println("Middle Character of " + str[index] + " is " + str[index].charAt(midChar));
		}
	}
	
	public static void main(String[] args) {
		MiddleCharOfString middleCharOfString = new MiddleCharOfString();
		String[] arr = {"Techno", "Hello", "Credits"};
		middleCharOfString.getMiddleCharOfStr(arr);
	}
}
