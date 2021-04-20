/*
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */

package paras.Assignment_25;

public class StringContainsNumber {
	
	String[] getStringContainsNumber(String[] str) {
		String[] output = new String[5];
		int strindex = 0;
		for(int index = 0; index < str.length; index++) {
			boolean flag = false;
			for(int innerindex = 0; innerindex < str[index].length(); innerindex++) {
				char ch = str[index].charAt(innerindex);
				if(Character.isDigit(ch)) {
					flag = true;
					break;
			}	
		}
			if(flag == true) {
				output[strindex] = str[index];
				strindex++;
		}
	}
		return output;
	}	
	
	public static void main(String[] args) {
		StringContainsNumber stringContainsNumber = new StringContainsNumber();
		String[] arr = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] answer = stringContainsNumber.getStringContainsNumber(arr);
		for(int index = 0; index < arr.length; index++) {
			if (answer[index] != null)
			System.out.println(answer[index]);
			
		}
	}
}
