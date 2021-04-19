package milind.Assignment_14;

import java.util.Scanner;

public class VowelWithScanner {
	
	void printvowels(String charactor) {
		switch(charactor){
		
			case"A":
			case"a":
				System.out.println(charactor+ " is vowel");
				break;
			case"E":
			case"e":
				System.out.println(charactor+ " is vowel");
				break;
			case"I":
			case"i":
				System.out.println(charactor+ " is vowel");
				break;
			case"O":
			case"o":
				System.out.println(charactor+ " is vowel");
				break;
			case"U":
			case"u":
				System.out.println(charactor+ " is vowel");
				break;
			default:
				System.out.println(charactor+ " is not vowel");
				break;
			
		}
	}
	public static void main(String[] args) {
		VowelWithScanner m1=new VowelWithScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the Charactor");
		String char1=scanner.next();
		
		m1.printvowels(char1);
	}

}
