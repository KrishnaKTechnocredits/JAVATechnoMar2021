package amrutaM.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/
public class Program1_RemoveDuplicates {

	static void removeDuplicates(ArrayList<String> names) {
		ArrayList<String> output = new ArrayList<String> ();
		for(int index=0;index<names.size();index++) {
			String checkName = names.get(index);
			if(names.indexOf(checkName)==index) {
				output.add(checkName);
			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"));
		removeDuplicates(names);
	}
}
