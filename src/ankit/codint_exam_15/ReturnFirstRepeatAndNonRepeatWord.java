/*
 Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */
package ankit.codint_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnFirstRepeatAndNonRepeatWord {

	static String getFirstNonRepeatingWord(ArrayList<String> strArrList){
		String nonRepeatWord = "";
		for(int index = 0 ; index < strArrList.size(); index++){
			if(strArrList.indexOf(strArrList.get(index)) == strArrList.lastIndexOf(strArrList.get(index))) {
				nonRepeatWord = strArrList.get(index);
				break;	
			}	
		}return nonRepeatWord;
	}

	static String getFirstRepeatingWord(ArrayList<String> strArrList){
		String repeatWord = "";
		for(int index = 0 ; index < strArrList.size();index++){
			if(strArrList.indexOf(strArrList.get(index)) != strArrList.lastIndexOf(strArrList.get(index))) {
				repeatWord = strArrList.get(index);
				break;	
			}
		}return repeatWord;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String[] strArr = str.split(" ");
		ArrayList<String> strArrList = new ArrayList<String>(Arrays.asList(strArr));
		System.out.println("Input String : "+strArrList);
		System.out.println("First Non Repeting Word : "+getFirstNonRepeatingWord(strArrList));
		System.out.println("First Repeating Word : "+getFirstRepeatingWord(strArrList));
	}
}
