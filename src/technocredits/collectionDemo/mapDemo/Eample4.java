package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Eample4 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		//System.out.println(hm.isEmpty());
		//System.out.println(hm.size() == 0);
		System.out.println(hm);
		hm.put("Maulik", "Kanani");
		hm.put("Aashvi", "Kanani");
		System.out.println(hm);
		
		hm.remove("Maulik"); // returns a value
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
		/*LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		Hashtable<String,String> hs = new Hashtable<String,String>();
		*/
		
		
	}
}
