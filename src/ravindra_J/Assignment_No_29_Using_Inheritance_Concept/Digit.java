package ravindra_J.Assignment_No_29_Using_Inheritance_Concept;

import ravindra_J.Assignment_No_29_Using_Inheritance_Concept.Letter;

public class Digit extends Letter{
	String temp="0";
	int even,odd;
	public void getDigit(String str) {
		int concatedDigit = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				concatedDigit = Integer.parseInt(temp);	
			}
			else if(concatedDigit!=0) {
				if (concatedDigit%2==0) {
					even = even +  concatedDigit;
				}
				else {
					odd = odd + concatedDigit;
				}	
				temp="0";
				concatedDigit=0;
			}
			else {

			}
		}
		if (concatedDigit%2==0) {
			even = even +  concatedDigit;
		}
		else {
			odd = odd + concatedDigit;
		}
	}
}

