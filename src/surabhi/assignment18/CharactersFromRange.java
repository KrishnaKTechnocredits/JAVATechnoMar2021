package surabhi.assignment18;

import java.util.Scanner;

public class CharactersFromRange {
	void findCharacterfromRange() {
		for(int num=97;num<=127;num++) {
			System.out.println("character of ascii value "+num+" is "+(char)num);
		}
	}
	
	public static void main(String[] args) {
		CharactersFromRange charactersFromRange=new CharactersFromRange(); 
		charactersFromRange.findCharacterfromRange(); 
	}
}
