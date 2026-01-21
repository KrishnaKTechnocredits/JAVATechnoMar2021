package amrutaM.Assignment45;
/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

import java.util.ArrayList;
import java.util.Arrays;

public class Program2_GetDuplicates {

	static void getDuplicate(ArrayList<String> namesList) {
		ArrayList<String> output = new ArrayList<>();
		for(int index=0;index<namesList.size();index++) {
			String name = namesList.get(index);
			if(namesList.indexOf(name)!=namesList.lastIndexOf(name)) {
				if(!output.contains(name))
					output.add(name);
				
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String[] names = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(names));
		getDuplicate(namesList);
	}
}
