/* Assignment 21: 14th April'2021  Without using Character Class Methods

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

*/

package amruta.Assignment_21;

public class SumofDigitfromstring {

	void getCountAll(String str){
		int sum = 0;
		for(int index = 0; index<str.length();index++){
			char ch = str.charAt(index);
			
			if(ch >= 48 && ch <= 57)
			sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of All digits from given string is : "+sum);
	}		

	public static void main(String[] args){
	
	String str = "J7yu9y8h1h8j4b7j3jjb6";
	new SumofDigitfromstring().getCountAll(str);
	
	}
	
}
