/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]  
*/
package kajal.Codingexam;

import java.util.ArrayList;

public class returnWordmoreThn2vowels {
	ArrayList<String> getNames(ArrayList<String> nameList) {
		ArrayList<String> outputNameList = new ArrayList<String>();
		for (int index = 0; index < nameList.size(); index++) {
			String word = nameList.get(index);
			int count = 0;
			for (int innerIndex = 0; innerIndex < word.length(); innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			if (count > 2)
				outputNameList.add(word);
		}
		return outputNameList;
	}

	public static void main(String[] args) {
		returnWordmoreThn2vowels vowels = new returnWordmoreThn2vowels();
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("aashay");
		nameList.add("sandesh");
		nameList.add("madhavi");
		nameList.add("ankit");
		nameList.add("ami");
		nameList.add("priyanka");

		ArrayList<String> ans = vowels.getNames(nameList);
		System.out.println(ans);
	}
}
