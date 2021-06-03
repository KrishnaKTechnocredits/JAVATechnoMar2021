/*
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : [Hi, Maulik, Techno, Credits, Hello]
 */

package ankit.codint_exam_15;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class GetUniqueWordsString {

	static String getUniqueWordsString(String[] strArr){
		String output = "";
		LinkedHashSet<String> arrListLHS = new LinkedHashSet<String>(Arrays.asList(strArr));
		for(String word : arrListLHS){
			output = output + word + " ";
		}return output.trim();
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String[] strArr = str.split(" ");
		System.out.println("Input String :"+str);
		System.out.println("Output Unique Word String :"+getUniqueWordsString(strArr));
	}
}
