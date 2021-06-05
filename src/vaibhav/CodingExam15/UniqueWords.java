/*28th May Coding Exam-15 : Collection

Program 1 : 
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Maulik Techno Credits Hello

*/

package vaibhav.CodingExam15;

import java.util.LinkedHashSet;

public class UniqueWords {

	String getUniqueWords(String[] arrStr) {
		String output = "";
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		for (String name : arrStr) {
			if (lhs.add(name))
				output = output + name + " ";
		}
		output.trim();
		return output;
	}

	public static void main(String[] args) {
		
		UniqueWords uniqueWords = new UniqueWords();
		
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";

		String[] arrStr = str.split(" ");
		
		String output = uniqueWords.getUniqueWords(arrStr);
		System.out.println("Unique Words form given string are : ");
		System.out.println(output);
		
	}

}
