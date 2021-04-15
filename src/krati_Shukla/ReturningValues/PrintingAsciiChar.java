//Program 3: write a method which will print ascii value of A to Z.

//Program 4: write a program which will print characters between ascii value 97 to 122.

package krati_Shukla.ReturningValues;

public class PrintingAsciiChar {
	
	void printAscii() {
		
		for (char ch='A'; ch<='Z'; ch++) {
			int ascii = (int)ch;
			System.out.println("Chatacter "+ch+" ASCII value is :"+ascii);
		}
		
	}
		
		void printChar() {
			
			for (int ascii=97; ascii<123; ascii++) {
				char ch = (char)ascii;
				System.out.println("ASCII "+ascii+" is associated to character :"+ch);
			}
			
		}	

	public static void main(String[] a) {
		PrintingAsciiChar printingAsciiChar = new PrintingAsciiChar();
		printingAsciiChar.printAscii();	
		printingAsciiChar.printChar();	
	}
}
