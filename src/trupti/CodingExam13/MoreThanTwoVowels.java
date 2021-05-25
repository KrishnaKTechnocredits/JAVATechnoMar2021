package trupti.CodingExam13;
/*Return all the words having more than two vowels from given array.
 * Input=["aashay","sandesh","madhvi","ankit","priyanka"]
 * output=[aashay, madhavi, priyanka]*/

import java.util.ArrayList;

public class MoreThanTwoVowels {

	boolean getMoreThanTwoVowels(String str) {
		String vowels="aeiou";
		int count=0;
		boolean flag=false;
		for(int index=0;index<str.length();index++) {
			if (vowels.contains(String.valueOf(str.charAt(index))))
					count++;
			if(count>2) {
				flag=true;
				break;
			}
		}return flag;
	}
	
	public ArrayList<String> getVowels(String words[]){
		ArrayList<String>output=new ArrayList<String>();
		for(int index=0;index<words.length;index++) {
			if (getMoreThanTwoVowels(words[index]))
				output.add(words[index]);
		}return output;
	}

	public static void main(String[] args) {
		String [] input =  {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> output = new MoreThanTwoVowels().getVowels(input);
		System.out.println(output);

	}

}
