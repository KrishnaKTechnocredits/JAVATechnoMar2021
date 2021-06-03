/* Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}*/
package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam13_P2 {

	ArrayList<String> getVowels(ArrayList<String> strarr) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < strarr.size(); index++) {
			String str = strarr.get(index);
			str = str.toLowerCase();
			int count = 0;
			for (int innerindex = 0; innerindex < str.length(); innerindex++) {
				char ch = str.charAt(innerindex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			if (count > 2)
				output.add(strarr.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam13_P2 codingExam13_P2 = new CodingExam13_P2();
		ArrayList<String> strarr = new ArrayList<String>();
		strarr.add("aashay");
		strarr.add("sandesh");
		strarr.add("madhavi");
		strarr.add("ankit");
		strarr.add("ami");
		strarr.add("priyanka");
		ArrayList<String> output = codingExam13_P2.getVowels(strarr);
		System.out.println("Words having more than two vowels are " + output);
	}
}
