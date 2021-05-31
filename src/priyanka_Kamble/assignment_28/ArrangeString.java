package priyanka_Kamble.assignment_28;

import java.util.Arrays;

/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis */
/*65-90
97-122
48-57*/

public class ArrangeString {
	
	String arrageString(String inputString) {
		String digit ="" , upperCaseLetter= "" , LowerCaseLEtters ="";
		
		for(int index= 0 ; index < inputString.length() ; index++) {
			char ch = inputString.charAt(index);
			if(ch >= 65 && ch<= 90 ) 
				upperCaseLetter += ch + "";	
			else if(ch >= 97 && ch<= 122)
				LowerCaseLEtters += ch + "";
			else if(ch >= 48 && ch<= 57)
				digit += ch + "";	
		}
		return digit+upperCaseLetter +LowerCaseLEtters;
	}
	
	public static void main(String[] args) {
		String inputString = "Te1Ch2noCr4e_%$d8iTs9";
		System.out.println("Input String - " +Arrays.asList(inputString));
		//new ArrangeString().arrageString(inputString);
		
		System.out.println(" output String -  " +new ArrangeString().arrageString(inputString));
	}
}
