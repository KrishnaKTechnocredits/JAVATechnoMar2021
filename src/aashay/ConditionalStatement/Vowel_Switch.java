package aashay.ConditionalStatement;
/*
 * Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
 */

public class Vowel_Switch {
	
	void vowel(String ch) {
		switch(ch) {
			case "a": 
				System.out.println("a is a vowel");	
				break;
			case "e": 
				System.out.println("e is a vowel");	
				break;
			case "i": 
				System.out.println("i is a vowel");	
				break;
			case "o": 
				System.out.println("o is a vowel");	
				break;
			case "u": 
				System.out.println("u is a vowel");	
				break;
			default:
				System.out.println(ch+" is not a vowel");
				
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel_Switch vowel_switch = new Vowel_Switch();
		vowel_switch.vowel("i");
		vowel_switch.vowel("z");
		vowel_switch.vowel("a");
		vowel_switch.vowel("w");
		vowel_switch.vowel("e");
		vowel_switch.vowel("r");
		vowel_switch.vowel("u");
		
		
	}

}
