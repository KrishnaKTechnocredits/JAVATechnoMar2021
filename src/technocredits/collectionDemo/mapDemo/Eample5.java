package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Eample5 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put(null, null);
		hm.put("Kapil", null);
		System.out.println(hm);
		
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		lhm.put(null, null);
		lhm.put("Kapil", null);
		System.out.println(lhm);
				
		TreeMap<String,String> tm = new TreeMap<String,String>();
		//tm.put(null, null); // Null pointer exception
		tm.put("Kapil", null);
		System.out.println(tm);
		
		Hashtable<String,String> hs = new Hashtable<String,String>();
		hs.put(null, null);
		hs.put("Kapil", null);
		System.out.println(hs);
	}
}
