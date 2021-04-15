package pallavi.Assignment_20;

/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class SumofDigit {

	void sum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digit in String is "+sum);
	}

	public static void main(String[] args) {
		String name = "J7yu9y8h1h8j4b7j3jjb6";
		new SumofDigit().sum(name);
	}

}
