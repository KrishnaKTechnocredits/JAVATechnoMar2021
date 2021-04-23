package ashwini.assignment24;
/*
 
Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.

 */

public class ReturnMiddleCharOfString {
	char printMidCharOString(String str) {
		char middleChar = ' ' ;
		for(int index = 0; index<str.length(); index++) {
			for(int j = index+1; j<str.length()/2; j++) {
				 //ch  = (char)((char)str.length()/2-1);
				middleChar = str.charAt(str.length()/2);
			}
		}
		//System.out.println(str.charAt(str.length()/2-1));
		return  middleChar;
	}
	
	char[] returnMidCharOfString(String[] array) {
		char middleChar[] = new char[3];
		// str = "";
		for(int index = 0; index<array.length; index++) {
			middleChar[index] = printMidCharOString(array[index]);
		}
		return middleChar; 
	}
	public static void main(String[] args) {
		String[] arr = {"Techno", "Hello", "Credits"};
		ReturnMiddleCharOfString returnMiddleCharOfString = new ReturnMiddleCharOfString();
		//returnMiddleCharOfString.printMidCharOString("Techno");
		//System.out.println(returnMiddleCharOfString.printMidCharOString("Techno"));
		System.out.println(returnMiddleCharOfString.returnMidCharOfString(arr));

	}

}
