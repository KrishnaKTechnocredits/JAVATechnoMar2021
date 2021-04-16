/*Program 3:  write a method which will print ascii value of A to Z. */
package ravindra_J.Assignment_No_18_AsciiValueOperations;
public class AsciiValueOfAtoZ {
	
	static int asciiValue ;
	static int getAsciiOfChar(char c) {
		asciiValue = c;
		return asciiValue;
	}
	public static void main(String[] args) {
		
		for(char ch = 'A'; ch <= 'Z';ch++ ) {
			getAsciiOfChar(ch);
			System.out.println(asciiValue);
		}
		
	}
}
