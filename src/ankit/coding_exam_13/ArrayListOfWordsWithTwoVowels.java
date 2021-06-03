package ankit.coding_exam_13;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOfWordsWithTwoVowels {
	
	static ArrayList<String> getWordWithTwoVowels(ArrayList<String> strArr){
		ArrayList<String> output = new ArrayList<String>();
		for(int index = 0 ; index < strArr.size(); index++){
			String targetName = strArr.get(index);
			boolean flag = isHavingTwoVowel(targetName);
			if (flag){
				output.add(strArr.get(index));
			}	
		}
		return output;
	}

	static private boolean isHavingTwoVowel(String targetName){
		int count = 0;
		String lowerCaseTargetName = targetName.toLowerCase();
		for(int index = 0 ; index < targetName.length(); index++){
			if(lowerCaseTargetName.charAt(index) == 'a' || lowerCaseTargetName.charAt(index) == 'e' 
					|| lowerCaseTargetName.charAt(index) == 'i' || lowerCaseTargetName.charAt(index) == 'o' 
					|| lowerCaseTargetName.charAt(index) == 'u'){
				count = count+1;
			}
		}
		if (count > 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args){
		String[] strArr = {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> strArrList = new ArrayList<String>(Arrays.asList(strArr));
		System.out.println("Input :"+strArrList);
		System.out.println("Output :"+getWordWithTwoVowels(strArrList));
	}
}
