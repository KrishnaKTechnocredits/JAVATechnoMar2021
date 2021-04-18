/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */
package radha.WithoutCharClassMethods.Assignment21;

public class FindStringDigitSum {
	
	int getSumOfDigits(String str) {
		int sum =0;
		for(int index = 0; index < str.length();index++) {
			char ch = str.charAt(index);
			if(ch >= 48 && ch <=57)
			sum+= Integer.parseInt(String.valueOf(ch));	
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		FindStringDigitSum digitsum = new FindStringDigitSum();
		String Istr = "J7yu9y8h1h8j4b7j3jjb6";
		System.out.println("Input string is "+Istr);
		System.out.println("==============================================");
		int sumAll =digitsum.getSumOfDigits(Istr);	
		System.out.println("Sum of all digits in String is: "+sumAll);
	}
}
