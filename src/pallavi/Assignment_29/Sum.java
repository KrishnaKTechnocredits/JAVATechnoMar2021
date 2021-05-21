package pallavi.Assignment_29;

/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
*/

public class Sum {

	String addAll(String str) {
		String digit = "0";
		String uppercase = "";
		String lowercase="";
		int sumOdd = 0;
		int sumEven = 0;
		//int sum = 0;
		int num;
		for (int index = 0; index < str.length(); index++) {
			char num1 = str.charAt(index);
			char num2 = 0;
			if(index != str.length()-1) {
			num2 = str.charAt(index+1);
			}
			if (Character.isDigit(num1)) {
				
				digit = digit + str.charAt(index);
				if(!Character.isDigit(num2)) {
					int num11=Integer.parseInt(digit);
					if(num11%2==0) {
						sumEven += num11;
						}
						else {
							sumOdd+=num11;
						}
					digit= "0";
				}
			}

			else if(Character.isLetter(num1)) {
				if(Character.isUpperCase(num1)) {
					uppercase+=num1;
					
				}
				else {
					lowercase+=num1;
				}
			}
		}
		
		return String.valueOf(sumOdd)+uppercase+lowercase+String.valueOf(sumEven);

	}

	
	public static void main(String[] args) {
		String input = "F12TT45ERT5cc56de111";
		String output=new Sum().addAll(input);
		System.out.println(output);
	}

}
