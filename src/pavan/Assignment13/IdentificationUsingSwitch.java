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
			case "d":
			case "D":
				System.out.println("d is not vowel");
				break;
			case"I":
				System.out.println("I is vowel");
				break;
			case"i":
				System.out.println("i is vowel");
				break;
				
		}
	}
	public static void main(String[] args) {
		IdentificationUsingSwitch m1= new IdentificationUsingSwitch();
		m1. printvovels("d");
		m1.printvovels("I");
		m1.printvovels("i");
	}

}
