/*package monika.Practise1.Ass29;
Assignment - 29 : 27th April'2021
Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68
45+5+111 = 161
12+56


public class Test1 {
	static void getOutput() {
		String input = "F12TT45ERT5cc56de111";
		String s1 = input.substring(1, 3);
		int evenn1 = Integer.parseInt(s1);
		String s2 = input.substring(5, 7);
		int oddn1 = Integer.parseInt(s2);
		String s3 = input.substring(10, 11);
		int oddn2 = Integer.parseInt(s3);
		String s4 = input.substring(13, 15);
		int evenn2 = Integer.parseInt(s4);
		String s5 = input.substring(17, 20);
		int oddn3 = Integer.parseInt(s5);

		int sumOfOdd = oddn1 + oddn2 + oddn3;
		int sumOfeven = evenn1 + evenn2;
		String upperCase = "", lowerCase = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter((input.charAt(index)))) {
				if (Character.isUpperCase(input.charAt(index)))
					upperCase += input.charAt(index);
				else
					lowerCase += input.charAt(index);
			}
		}
		System.out.println(sumOfOdd + upperCase + lowerCase + sumOfeven);
		System.out.println(oddn1 + oddn2 + oddn3 + upperCase + lowerCase + sumOfeven);
	}

	void m1() {
		String input = "F12TT45ERT5cc56de111";
		String upperCase1 = "",lowerCase1 = "", temp = "";
		int evenSum = 0, oddSum = 0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				temp += input.charAt(index);
			}else if(Character.isLetter(input.charAt(index))) {
				if(temp!= "") {
					int n = Integer.parseInt(temp);
					temp = "";
					if(n % 2 == 0)
						evenSum += n;
					else
						oddSum += n;
				}
				if(Character.isUpperCase(input.charAt(index)))
					upperCase1 += input.charAt(index);
				else
					lowerCase1 += input.charAt(index);
	}

	public static void main(String[] args) {
		getOutput();
	}
}
*/