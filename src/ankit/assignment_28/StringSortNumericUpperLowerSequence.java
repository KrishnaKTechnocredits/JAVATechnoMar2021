/*
Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */


package ankit.assignment_28;

public class StringSortNumericUpperLowerSequence {
	
	
	String checkCharacterTypeInString(String str) {
		String digit = "", lower ="", upper = "";
		for (int index = 0 ; index < str.length() ; index++) {
			if(Character.isDigit(str.charAt(index))){
				digit = digit + str.charAt(index);
			}else if(Character.isLowerCase(str.charAt(index))) {
				lower = lower +str.charAt(index);
			}else if(Character.isUpperCase(str.charAt(index))) {
				upper = upper +str.charAt(index);
			}
		}return (digit + upper + lower) ;
	}
	
	String[] checkCharacterTypeInString(String strArray[]) {
		String[] output = new String[strArray.length];
		for(int index = 0 ; index < strArray.length ; index++) {
			String arrStringItem = checkCharacterTypeInString(strArray[index]);
			output[index] = arrStringItem;
		}
		return output;
	}

	public static void main(String[] args) {
		StringSortNumericUpperLowerSequence stringSortNumericUpperLowerSequence = new StringSortNumericUpperLowerSequence();
		String str1  = "An23K5itMa5Lvi08";
		String[] strArray = {"123LeaRN567","C3o4D6iN8g","686F99rom0","67Te8Chno6r8dIts"};
		System.out.println("Output 1 :" +stringSortNumericUpperLowerSequence.checkCharacterTypeInString(str1));
		String outputFromArrayString[] = stringSortNumericUpperLowerSequence.checkCharacterTypeInString(strArray);	
		for (int index = 0 ; index < outputFromArrayString.length ; index++){
			System.out.print(outputFromArrayString[index]+" ");
		}
	}

}
