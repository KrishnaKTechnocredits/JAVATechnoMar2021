package madhavi_Raut.CodingExam.Exam_13;

import java.util.ArrayList;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
//write your logic
}*/

public class FindWordWithAtleast2Vowels {

	ArrayList<String> getWordWithAtleast2Vowels(String[] names) {
		ArrayList<String> namesWithVowels = new ArrayList<String>();
		for (int index = 0; index < names.length; index++) {
			int count = 0;
			boolean flag = false;
			for (int innerIndex = 0; innerIndex < names[index].length(); innerIndex++) {
				String ch = String.valueOf(names[index].charAt(innerIndex));
				if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i")
						|| ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")) {
					count++;
					if (count > 2) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				namesWithVowels.add(names[index]);
			}
		}
		return namesWithVowels;
	}

	public static void main(String[] args) {
		String[] names = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		System.out.println("Below are the names with atleast 2 vowels in it:");
		System.out.println(new FindWordWithAtleast2Vowels().getWordWithAtleast2Vowels(names));
	}
}
