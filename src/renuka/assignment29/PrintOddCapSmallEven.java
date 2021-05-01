package renuka.assignment29;

/*
 Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
 */

public class PrintOddCapSmallEven {
	
	String getArrangement(String input) {
		
		int evenSum = 0, oddSum = 0;
		String upperCaseStr = "", lowerCaseStr = "";
		String temp = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
			    temp += ch;
			    if(temp.length() > 0 && index == input.length()-1) {
			    int num = Integer.parseInt(temp);
				if(num % 2 ==0) {
				    evenSum += num;
				}
				else {
					oddSum += num;
				}
				temp = "";
			    }
			}
			else if(Character.isLetter(ch)) {
			    if(temp.length() > 0) {
			    int num = Integer.parseInt(temp);
				if(num % 2 ==0) {
				    evenSum += num;
				}
				else {
					oddSum += num;
				}
				temp = "";
		   }
			if(Character.isUpperCase(ch)) 
				upperCaseStr += ch;
			else 
				lowerCaseStr += ch;	
		    }	 	
        }
		String output = oddSum + upperCaseStr + lowerCaseStr + evenSum;
	    return output;
    }

	public static void main(String[] args) {
		PrintOddCapSmallEven printString = new PrintOddCapSmallEven();
		String str = "F12TT45ERT5cc56de111";
		//String output = new str.length();
		String output = printString.getArrangement(str);
		System.out.println(output);

	}

}
