/*
 * Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
 */

package ankit.coding_exam_21;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.SpringLayout.Constraints;

public class SwapTargetCharacters {
	
	static String getReplacedString(String str, String target){
		String strLowerCase = str.toLowerCase();
		while(strLowerCase.contains(target)) { 
 			int indexToReplaceChar = strLowerCase.indexOf(target);
 			String t = String.valueOf(str.charAt(indexToReplaceChar)) + String.valueOf(str.charAt(indexToReplaceChar+1));
			StringBuffer SB = new StringBuffer(t);
			String reverSB = SB.reverse().toString();	
			strLowerCase = strLowerCase.replaceFirst(target, reverSB);			
		}
		return strLowerCase;
	}

	public static void main(String[] args) {
		String str="This is the thread that given";
		String target ="th";
		System.out.println(getReplacedString(str, target));
	}
}
