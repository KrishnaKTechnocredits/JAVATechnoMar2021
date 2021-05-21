/*Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class ReturnStringsContainingDigits {
	
	boolean getString(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				return true;
			}
		}
		return false;
	}
	
	String [] getStringArray(String [] str) {
		String [] output = new String[str.length];
		int index = 0;
		for(int i= 0; i<str.length; i++) {
			boolean flag = getString(str[i]);
			if(flag == true) {
				output [index] = str[i];
				index++;
			}
				
		}
		return output;
		
	}
	
	public static void main(String[] a) {
		ReturnStringsContainingDigits returnStringsContainingDigits = new ReturnStringsContainingDigits();
		String [] names = {"TechnoCredits" , "HP1w" , "Pd3R4K9" , "Krishna" , "Aashvi25"};
		String [] output = returnStringsContainingDigits.getStringArray(names);
		for(int index = 0; index<output.length;index++) {
			System.out.println(output[index]);
		}
	}

}
