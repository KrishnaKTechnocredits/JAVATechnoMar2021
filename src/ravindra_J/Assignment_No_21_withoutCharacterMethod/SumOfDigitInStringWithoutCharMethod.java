/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */

package ravindra_J.Assignment_No_21_withoutCharacterMethod;

public class SumOfDigitInStringWithoutCharMethod {

	public static void main(String[] args) {
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		int sum=0;
		for(int i=0; i<str.length();i++) {

			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9') {
				int num=Integer.parseInt(String.valueOf(ch));
				System.out.println(num);
				sum+=num;	
			}	
		}
		System.out.println("The sum of given string number is: " +sum);
	}

}
