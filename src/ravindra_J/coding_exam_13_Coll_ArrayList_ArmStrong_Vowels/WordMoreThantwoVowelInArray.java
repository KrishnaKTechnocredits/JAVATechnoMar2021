/*coding test 13:
 2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]
 */
package ravindra_J.coding_exam_13_Coll_ArrayList_ArmStrong_Vowels;

import java.util.ArrayList;

public class WordMoreThantwoVowelInArray {
	public ArrayList<String> getVowels(String words[]){
		ArrayList<String> output=new ArrayList<String>();

		for(int i=0;i<words.length;i++) {
			int count=0;
			String str=words[i];
			for(int index=0;index<str.length();index++) {
				char ch=str.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u') {
					count++;
				}
			}
			if(count>=3) {
				output.add(str);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		WordMoreThantwoVowelInArray vowel=new WordMoreThantwoVowelInArray();
		String[] input= {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> answer=vowel.getVowels(input);
		System.out.println(answer);
	}

}
