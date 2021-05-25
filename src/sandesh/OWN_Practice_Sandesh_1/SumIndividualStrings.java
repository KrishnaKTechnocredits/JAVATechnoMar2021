/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
 */

package sandesh.OWN_Practice_Sandesh_1;

public class SumIndividualStrings {
	
	int sumEven, sumOdd;
	int[] getAddition(String inNumString){
		int[] evenOddArray = new int[2];
		int num = Integer.parseInt(inNumString);
		if(inNumString.equals("")) {
			num = 0;
			sumEven += num;
			sumOdd += num;
		}
		else {
			if(num %2 == 0)
				sumEven += num;
			else
				sumOdd += num;
		}
		evenOddArray[0] = sumEven;
		evenOddArray[1] = sumOdd;
		return evenOddArray;
	}

	String getEachString(String inStr) {
		String numString = ""; 
		String upperCase = "";
		String lowerCase = "";
		int[] getEvenOddArray = new int[2];
		for(int index = 0; index < inStr.length(); index++) {
			if(Character.isDigit(inStr.charAt(index))) {
				numString += inStr.charAt(index);
				if(index == inStr.length()-1 || Character.isLetter(inStr.charAt(index+1))) {
					getEvenOddArray = getAddition(numString);
					numString = "";
				}
			}
			else if(Character.isUpperCase(inStr.charAt(index)))
				upperCase += inStr.charAt(index);
			else if(Character.isLowerCase(inStr.charAt(index)))
				lowerCase += inStr.charAt(index);
		}
		return (getEvenOddArray[1] + upperCase + lowerCase + getEvenOddArray[0]);
	}
	
	public static void main(String[] args) {
		String str = "F12TT45ERT5cc56de111";
		String sortedString = new SumIndividualStrings().getEachString(str);
		System.out.println("Sorted output is -: ");
		System.out.println(sortedString);
	}
}
