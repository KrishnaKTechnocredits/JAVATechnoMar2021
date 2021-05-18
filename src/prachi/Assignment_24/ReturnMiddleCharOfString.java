package prachi.Assignment_24;

/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.*/


public class ReturnMiddleCharOfString {

	void returnMiddleCharOfString(String[] str) {
		int middleChar;
		for(int index = 0; index < str.length ; index++) {
			if(str[index].length() % 2 == 0) {
				middleChar = ((str[index].length() / 2)-1);
			} else {
				middleChar = (str[index].length() / 2);
			}
			System.out.print(str[index].charAt(middleChar));
		}
	}

	public static void main(String[] args) {
		ReturnMiddleCharOfString middlechar = new ReturnMiddleCharOfString();
		String[] arr = {"Techno", "Hello", "Credits"};
		middlechar.returnMiddleCharOfString(arr);
	}
}
