/*
 WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
 */

package pavan.Assignment13;

public class IdentificationUsingSwitch {
	
	void printvovels(String charactor) {
		switch (charactor) {

			case"A":
			case"a":
				System.out.println(charactor+ " is vowel");
			break;
			case"E":
			case"e":
				System.out.println(charactor +" is vowel");
			break;
			case"I":
			case"i":
				System.out.println(charactor+" is vowel");
				break;
			case"O":
			case"o":
				System.out.println(charactor+" is vowel");
				break;
			case"U":
			case"u":
				System.out.println(charactor+" is vowel");
				break;
			default:
				System.out.println(charactor+" is not vowel");
				break;
		}
	}
	public static void main(String[] args) {
		IdentificationUsingSwitch m1= new IdentificationUsingSwitch();
		m1. printvovels("m");
		
	}

}
