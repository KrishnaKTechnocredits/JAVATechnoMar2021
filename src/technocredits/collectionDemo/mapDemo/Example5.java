package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Techno", "Credits");
		hm.put("Credits", "Mar2021");
		hm.put("BatchSize", "60Candidates");
		
		HashMap<String,String> hm1 = new HashMap<String,String>(hm);
		
		Set<String> keys = hm1.keySet();
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			if(key.length() > 6) {
				System.out.println("Going to remove " + key);
				itr.remove();
			}
		}
		System.out.println("Set :: " + keys);
		System.out.println(hm);
		System.out.println(hm1);
	}
}
