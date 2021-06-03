/*
2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
 */
package radha.CodingTest13;

import java.util.ArrayList;

public class StringWithTwoVowels {
	public ArrayList<String> getVowels(String words[]){
		boolean hasVowels;
		ArrayList<String> arr = new ArrayList<String>();
		for(int index=0;index<words.length;index++) {
			hasVowels=getString(words[index]);
			if(hasVowels)
				arr.add(words[index]);
		}
		return arr;
	}
	
	static boolean getString(String name) {
		boolean isStringEligible=false;
		int count =0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				if(count>=3) {
					isStringEligible=true;
					break;
				}
			}
		}
		return isStringEligible;
	}

	public static void main(String[] args) {
		StringWithTwoVowels twoVowels = new StringWithTwoVowels();
		String[] input = {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> output=twoVowels.getVowels(input);
		System.out.println("Strings having more that two vowels "+output);
	}
}
