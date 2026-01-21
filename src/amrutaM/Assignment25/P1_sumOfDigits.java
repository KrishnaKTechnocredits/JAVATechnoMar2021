package amrutaM.Assignment25;

/*Program 1: 
String str = "te12ch33no3credit4s";  
output = 12+33+3+4
*/
public class P1_sumOfDigits {

	void getSum(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp = temp + input.charAt(index);
			} else if (temp.length() > 0) {
				sum += Integer.parseInt(temp);
				temp = "";
			}
		}
		System.out.println("Sum of digits present in the string is --> " + sum);
	}

	public static void main(String[] args) {
		String input = "te12ch33no3credit4s";
		new P1_sumOfDigits().getSum(input);
	}

}
