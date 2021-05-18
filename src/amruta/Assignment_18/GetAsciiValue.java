/* Assignment 18 : 14th April'2021  Program 1:

 Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/

package amruta.Assignment_18;

public class GetAsciiValue {
	
	int getAsciiOfChar(char ch) {
		return ch;	
	}
	
	void getasciivalue() {
		 int ch1 = 'B';
		System.out.println("Ascii Value of B : "+ch1);
	}
		
	public static void main(String[] args) {
		GetAsciiValue ascii = new GetAsciiValue();
		
		int value =  ascii.getAsciiOfChar('A');
		System.out.println("Ascii Value "+value);
		
		ascii.getasciivalue();
		
	}

}
