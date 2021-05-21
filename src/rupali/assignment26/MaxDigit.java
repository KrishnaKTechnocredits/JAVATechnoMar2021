/*
 * Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */
package rupali.assignment26;

public class MaxDigit {
	String stringwitnmaxdigit(String[] input) {
		int i=0,j,count=0,maxcount=0;
		String ch1=null;
		for(i=0;i<input.length;i++) {
				for(j=0;j<input[i].length();j++) {
					//ch=input[i];
						if(Character.isDigit(input[i].charAt(j))) {
							count++;
							//j=Character.getNumericValue(ch);
							//sum=sum+j;
				}
				if(maxcount<count) {
					maxcount=count;
					ch1=input[i];
				}
		}
		}
		return ch1;
	}
	public static void main(String[] args) {

		String[]  input= {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		String str;
		MaxDigit maxDigit=new MaxDigit();
		str=maxDigit.stringwitnmaxdigit(input);
		System.out.println("The string array to find maximum digit in it");
		for(int i=0;i<input.length;i++)
			System.out.println(input[i]);
		System.out.println("String which contains maximum digits is: "+str);
		
	}

}
