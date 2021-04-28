/*Assignment - 29 : 27th April'2021
Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68
Hint : (45+5+111)FTTERTccde(12+56)
 */
package ravindra_J.Assignment_No_29_StringCharacterSorting;

public class FormatString{

	String output = null;
	String specialSum= "";
	String lowerLetterSum= "";
	String upperLetterSum= "";
	String temp = "0";


	int oddSum = 0;
	int evenSum=0;
	int num = 0;

	
	public static void main(String args[]){

		String input = "F12TT45ERT5cc56de111";

		FormatString fs = new FormatString();
		fs.getString(input);

	}

	void getString(String str){//F12TT45ERT5cc56de111

		for(int index=0;index<str.length();index++){

			char ch = str.charAt(index);

			if(Character.isDigit(ch)){
				temp = temp+ch;  

				num = Integer.parseInt(temp);
			}
			else{

				if(num%2==0) {
					evenSum = evenSum + num;

				}
				else{
					oddSum = oddSum + num;

				}
				num = 0;
				temp = "0";


				if(Character.isLetter(ch)){

					if(Character.isUpperCase(ch)){
						upperLetterSum = upperLetterSum + ch; 
					}
					else if(Character.isLowerCase(ch)){
						lowerLetterSum = lowerLetterSum + ch;
					}
					else{
						//System.out.println("Invalid");
						specialSum = specialSum + ch;
					}

				}
			}
		}
		if(num%2==0){
			evenSum = evenSum + num;
		}
		else{
			oddSum = oddSum + num;
		}
		output = oddSum+upperLetterSum+lowerLetterSum+evenSum;
		System.out.println("Soreted Format of String is -->> \n" + output);
		//return output;
	}

	
}						