package amrutaM.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]                               
output : [Akanksha, AparnaTiwari]*/

public class Program4_A_Names {

	static ArrayList<String> getNamesStartingWithA(ArrayList<String> namesList) {
		ArrayList<String> output = new ArrayList<>();
		for(String name:namesList) {
			if(name.startsWith("A") && name.length()>6)
				if(!output.contains(name))
					output.add(name);
		}
		return output;
	}
	
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"));
		ArrayList<String> result = getNamesStartingWithA(namesList);
		System.out.println(result);
	}
}
