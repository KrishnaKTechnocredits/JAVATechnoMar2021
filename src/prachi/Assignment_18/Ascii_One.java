package prachi.Assignment_18;

/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/


public class Ascii_One {
	
	int getAsciiOfChar(char ch){
		return ch;
	}
	
	public static void main(String[] args) {
		Ascii_One asOne = new Ascii_One();
		int value = asOne.getAsciiOfChar('a');
		System.out.println("The Ascii value : " +value);
	}
}

