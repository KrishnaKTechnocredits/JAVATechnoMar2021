package aashay.ASCII_Assignment_18;
/*
 * Assignment 18 : 14th April'2021
Program 4: write a program which will print characters between ascii value 97 to 122.
 */


public class AsciiToChar {
	
	  void asciiToChar(int num1, int num2) {
			for(int i = num1; i <= num2; i++) {
				char c = (char) i;
				System.out.println("ASCII Value : "+i+" Char = "+c);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AsciiToChar printAtoZ_ASCII = new AsciiToChar();
			printAtoZ_ASCII.asciiToChar(65,90);
			System.out.println("------------------------------------------------------------");
			printAtoZ_ASCII.asciiToChar(48,57);
			System.out.println("------------------------------------------------------------");
			printAtoZ_ASCII.asciiToChar(97,122);
		}
	
}
