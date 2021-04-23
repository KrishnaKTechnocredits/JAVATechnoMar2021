package bhavana_assignment_20;
/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53 */

public class SumOfNumbersFromString {
	
	String input="J7yu9y8h1h8j4b7j3jjb6";
	int sum;
	
	void sumofdigits() {
	
	for(int index=0;index<input.length();index++) {
		char ch=input.charAt(index);
			if(Character.isDigit(input.charAt(index)))
				sum=sum+Character.getNumericValue(ch);
	}
}
	public static void main(String[] args) {
		SumOfNumbersFromString ss=new SumOfNumbersFromString();
		ss.sumofdigits();
		System.out.println("Sum of digits is:"+ss.sum);
	}
	
	
}