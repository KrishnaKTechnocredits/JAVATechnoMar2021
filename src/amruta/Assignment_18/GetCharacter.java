/* Assignment 18 : 14th April'2021  Program 2: 

Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/

package amruta.Assignment_18;

public class GetCharacter {
	
	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
	}
	
	void getCharacter(){
		
		char ch = 122 ;		
		System.out.println("Character for given Value : "+ch);	
	} 
	
	public static void main(String[] args) {
		GetCharacter getchar = new GetCharacter();
		
		char ch1 = getchar.getAsciiOfChar(98);
		System.out.println("Character of given Value is : "+ch1);
		
		getchar.getCharacter();
		
	}

}
