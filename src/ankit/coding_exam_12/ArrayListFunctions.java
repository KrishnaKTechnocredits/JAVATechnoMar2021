package ankit.coding_exam_12;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class ArrayListFunctions {

	static int getTargetCount(ArrayList<String> strArray, String targetName){
		int count = 0;
		while(strArray.contains(targetName)) {
			count++;
			int index = strArray.indexOf(targetName);
			strArray.set(index, "Technocredit");	
		}
		System.out.println("Replaced Array : "+strArray);
		return count;	
	}

	public static void main(String[] args) {
		ArrayList<String> strArray = new ArrayList<String>();
		ArrayList<String> strArray1 = new ArrayList<String>();
		strArray.add("Aashay");
		strArray.add("Vaibhav");
		strArray.add("Aashay");
		strArray.add("Prashant");
		strArray.add("Aashay");
		strArray.add("Aashay");
		strArray.add("Prashant");
		strArray.add("Aashay");
		strArray1 = strArray;

		System.out.println("Input Array : "+strArray);
		System.out.println("Target Count : "+getTargetCount(strArray, "Aashay"));
	}
}
