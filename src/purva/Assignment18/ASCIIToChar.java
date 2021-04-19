/*
 * Assignment 18 : 14th April'2021
Program 4: write a program which will print characters between ascii value 97 to 122.
 */

package purva.Assignment18;

public class ASCIIToChar {

	  void asciiToChar(int num1, int num2) {
			for(int i = num1; i <= num2; i++) {
				char c = (char) i;
				System.out.println("ASCII Value : "+i+" Char = "+c);
			}
		}

		public static void main(String[] args) {
			
			ASCIIToChar printAtoZ_ASCII = new ASCIIToChar();
			//printAtoZ_ASCII.asciiToChar(48,57);//0 to 9 numbers
			//printAtoZ_ASCII.asciiToChar(65,90);//capital alphabets
			printAtoZ_ASCII.asciiToChar(97,122);//small alphabets
		}

}
