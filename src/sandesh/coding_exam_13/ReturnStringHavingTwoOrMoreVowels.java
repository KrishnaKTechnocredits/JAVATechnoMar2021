/*
2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
*/
package sandesh.coding_exam_13;

import java.util.ArrayList;

public class ReturnStringHavingTwoOrMoreVowels {
	private boolean getEligibleString(String strInp) {
		int count = 0;
		String strInpLowerCase = strInp.toLowerCase();
		boolean isAllowed = false;
		for (int index = 0; index < strInpLowerCase.length(); index++) {
			if (strInpLowerCase.charAt(index) == 'a' || strInpLowerCase.charAt(index) == 'e'  || strInpLowerCase.charAt(index) == 'i'  || 
				strInpLowerCase.charAt(index) == 'o'  || strInpLowerCase.charAt(index) == 'u')  {
				count ++;
				if (count == 3) {
					isAllowed = true;	
					break;
				}
			}
		}
		return isAllowed;
	}
	
	public ArrayList<String> getVowels(String words[]){
		boolean canConsider = false;
		ArrayList<String> stringAL = new ArrayList<String>();
		for (int index = 0; index < words.length; index++) {
			canConsider = getEligibleString(words[index]);
			if(canConsider) 
				stringAL.add(words[index]);
		}
		return stringAL;
	}
	
	public static void main(String[] args) {
		ArrayList<String> stringOutputAL = new ArrayList<String>();
		String[] input = {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		stringOutputAL = new ReturnStringHavingTwoOrMoreVowels().getVowels(input);
		System.out.println("Strings containing more than two vowels are -: ");
		System.out.println(stringOutputAL);
	}
}
