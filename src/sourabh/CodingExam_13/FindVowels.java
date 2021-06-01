/*
 2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
 */

package sourabh.CodingExam_13;

import java.util.ArrayList;
import java.util.Arrays;

public class FindVowels {
	// public ArrayList<String> getVowels(String[] words){
	public ArrayList<String> getVowels(String[] words) {
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(words));
		ArrayList<String> OutputNameList = new ArrayList<String>();		
		for (int index = 0; index < nameList.size(); index++) {
			int count = 0;
			String name= nameList.get(index);
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
				char checkCh= name.charAt(innerIndex);
				if (checkCh=='a'||checkCh=='e'||checkCh=='i'||checkCh=='o'||checkCh=='u')
					count++;
				}
			
			if (count > 2)
				OutputNameList.add(nameList.get(index));

		}
		return OutputNameList;
	}

	public static void main(String[] args) {
		String[] nameList = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		FindVowels findVowels = new FindVowels();
		ArrayList<String> output = findVowels.getVowels(nameList);
		System.out.println(output);
	}
}
