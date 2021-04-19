package surabhi.assignment18;

import java.util.Scanner;

public class AsciiOfAtoZ {
	void asciiValues() {
		for(char ch=65;ch<=90;ch++) {
			System.out.println("Ascii value of "+(int)ch+" is "+ch );
		}
	}
	
	public static void main(String[] args) {
		AsciiOfAtoZ asciiOfAtoZ=new AsciiOfAtoZ(); 
		asciiOfAtoZ.asciiValues(); 
	}
}
