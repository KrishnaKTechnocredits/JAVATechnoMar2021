package madhavi_Khasbage.CharacterPrograms;

/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F 12 TT 45 ERT 5 cc 56 de 111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
*/

public class SumOfEvenOddInString {

	String getString(String strInput) {
		String strFormated = "", strData = "", strCapital = "", strSmall = "";
		int sumOdd = 0, sumEven = 0, num = 0;
		char ch;
		for (int i = 0; i < strInput.length(); i++) {
			ch = strInput.charAt(i);
			if (Character.isDigit(ch)) {
				num = Integer.parseInt(String.valueOf(ch));
				strData += num; //Collect numbers
			} else {
				if (strData != "") { // Is number even or odd
					num = Integer.parseInt(strData);
					if (num % 2 == 0) {						
						sumEven += num;
					} else {						
						sumOdd += num;
					}
					strData = "";
				} 
				if (Character.isUpperCase(ch)) { //Collect upper case letters
					strCapital += ch;
				} else if (Character.isLowerCase(ch)) { // collect lower case letters
					strSmall += ch;
				}
			}
		}
		
		if (strData != "") { // for last index
			num = Integer.parseInt(strData);
			if (num % 2 == 0) {						
				sumEven += num;
			} else {						
				sumOdd += num;
			}			
		}
		strFormated = sumOdd + strCapital + strSmall + sumEven; //arrange string
		return strFormated;
	}

	public static void main(String[] args) {
		SumOfEvenOddInString objFormat=new SumOfEvenOddInString();
		System.out.println("Input:F12TT45ERT5cc56de111");
		System.out.println("Below are the Sum of all odd numbers + capital letter + small letter + sum of all even numbers in above input");
		System.out.println("Output:"+ objFormat.getString("F12TT45ERT5cc56de111"));
	}

}
