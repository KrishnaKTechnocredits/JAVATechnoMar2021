package shivani.Assignment_18;
/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

public class ReturnAsciiVaule {
	int getAsciiOfChar(char ch) {
		System.out.println((int) ch);
		return (int) ch;
	}

	public static void main(String[] args) {
		ReturnAsciiVaule returnAsciiVaule = new ReturnAsciiVaule();
		returnAsciiVaule.getAsciiOfChar('A');
	}
}
