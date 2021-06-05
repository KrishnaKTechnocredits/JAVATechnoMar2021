/* Assignment 29 - Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)  */

package amruta.Assignment_29_to_32;

public class PrintSumofOddletterSumofEven {
	
	void printOddsumLetterEvensum(String str) {
		
		String upper = "";
		String lower = "";
		String specialchar = "";
		int oddsum = 0;
		int evensum = 0;
		String temp = "";
		
		for(int index=0; index <str.length();index++) {
						
			char ch = str.charAt(index);
			
			if(Character.isDigit(ch)) {
				temp = temp + ch;
			
			}else if(Character.isLetter(ch)) {
				
					if(Character.isUpperCase(ch)) {
						upper = upper + ch;
					}else if(Character.isLowerCase(ch)) {
						lower = lower + ch;
					}else {
						specialchar = specialchar + ch;
					}
					
				
					if(!temp.equals("")) {
						
						if(Integer.parseInt(temp) % 2 == 0 )
							evensum = evensum + Integer.parseInt(temp);
						else
							oddsum = oddsum + Integer.parseInt(temp);
						
						temp="";
					}
			}									
		}
		
		if(!temp.equals("")) 
			
			if(Integer.parseInt(temp) % 2 == 0 )
				evensum = evensum + Integer.parseInt(temp);
			else
				oddsum = oddsum + Integer.parseInt(temp);

		System.out.println(oddsum+upper+lower+evensum);
		
	}
	
	public static void main(String[] args) {
		
		String str = "%F12TT45ERT5cc56de111";
		
		new PrintSumofOddletterSumofEven().printOddsumLetterEvensum(str);
	}

}
