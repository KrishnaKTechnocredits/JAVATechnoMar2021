package pavan.PavanB_Coding_exam_12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraysListFunctions {

	
	static int getTargetCount(ArrayList<String> strArray, String targetName) {
		
		int count=0;
		
		while (strArray.contains(targetName)) {
			count++;
			
			int index= strArray.indexOf(targetName);
			strArray.set(index, "Technocredits");
		}
		System.out.println("Replaced Array :"+ strArray);
			return count;
			
			
		}
	
	public static void main(String[] args) {
		ArrayList<String> strArray= new ArrayList<String>();
		ArrayList<String>strArray1= new ArrayList<String>();
		strArray.add("Aashay");
		strArray.add("Vaibhav");
		strArray.add("Aashay");
		strArray.add("Prashant");
		strArray.add("Aashay");
		strArray.add("Aashay");
		strArray.add("Prashant");
		strArray.add("Aashay");
		
		
		System.out.println("Input array"+ strArray);
		System.out.println("Target Count "+ getTargetCount(strArray, "Aashay"));
		
	}
	}

