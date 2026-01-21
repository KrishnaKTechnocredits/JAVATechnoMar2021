package amrutaM.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
public class Program3_PrintIndex {

	static void getIndex(ArrayList<String> names) {
		for(int index=0;index<names.size();index++) {
			if(names.get(index).equals("Akanksha")) 
				System.out.println(index);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"));
		getIndex(names);
		
	}
}
