package aashay.Test_13;
/*
 * 2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVowels {
	
	public ArrayList<String> getVowels(String words[]){
		
		ArrayList<String> vowels = new ArrayList<String>(Arrays.asList(words));
		ArrayList<String> outputList = new ArrayList<String>();
		for(String vowelWords : vowels) {
			vowelWords.toLowerCase();
			int cnt = 0;
			for(int index =0 ; index < vowelWords.length(); index++ ) {
				char ch = vowelWords.charAt(index);
				if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					cnt++;
				}
			}
			if(cnt > 2) {
				outputList.add(vowelWords);
			}
		}
		return outputList;
	}
	
	
	public static void main(String args[]) {
		ArrayListVowels arrayListVowels = new ArrayListVowels();
		String inputWords [] = new String[] {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> outputList = arrayListVowels.getVowels(inputWords);
		System.out.println("Words having vowels :"+outputList.toString());
	}

}
