/*WAP to sum all the numbers in given string.
	 Input: J7yu9y8h1h8j4b7j3jjb6
	 Ouput: Sum of all digits in String is: 53
	  */

package neha_Patil.NehaP_Assignment_20;

public class Count {

	 	void getDigitSum(String str) {
	 		int digitCount = 0, sum = 0;
	 		for(int index=0; index<str.length(); index++) {
	 	        if(Character.isDigit(str.charAt(index))) {
	 	        	digitCount++;
	 	        	sum=sum+Character.getNumericValue(str.charAt(index));
	 	        }
	 	    }
	 	    System.out.println("digit count in String is :"+digitCount); 
	 	    System.out.println("sum of digit count in String is :"+sum);
	 	}

	 	public static void main(String[] args) {
	 		Count sumOfDigitInString = new Count();
	 		sumOfDigitInString.getDigitSum("J7yu9y8h1h8j4b7j3jjb6");
	 	}

	 }

