package aashay.Assignment_24;
/*
 * Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.
 */

public class MiddleCharString {
	
	char [] middleChar(String[] names) {
		char [] chars = new char[names.length];
		
		for(int index = 0; index < names.length ; index++ ) {
			if(names[index].length()%2 == 0) {
				chars[index] = names[index].charAt((names[index].length()/2)-1);
			}else {
				chars[index] = names[index].charAt((names[index].length()/2));
			}
		}
		return chars;
	}
	 void display(char [] middleChar) {
		 System.out.println("Middle character of each String from are: \n");
		 for(int index = 0; index < middleChar.length; index++) {
			 System.out.println(middleChar[index]);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleCharString middleCharString = new MiddleCharString();
		String[] arr = {"Techno", "Hello", "Credits"};
		char [] middleChar = new char [3];
		middleChar = middleCharString.middleChar(arr);
		middleCharString.display(middleChar);
		
		
	}

}
