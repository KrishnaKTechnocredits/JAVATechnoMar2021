package bhavana_assignment_21;
/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53 */

public class SumOfDigits {

	String input="J7yu9y8h1h8j4b7j3jjb6";
	int sum;
	
	void sumOperation() {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch>=48 && ch<=57) {
				int num=Character.getNumericValue(input.charAt(index));
				sum=sum+num;
			}	
		}
		System.out.println("Sum is:"+sum);
	}
	public static void main(String[] args) {
		SumOfDigits sd=new SumOfDigits();
		sd.sumOperation();
	}
}
