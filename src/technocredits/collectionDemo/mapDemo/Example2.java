package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;

public class Example2 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("", "Maulik");
		hm.put("", "");
		hm.put(null,"");
		hm.put(null,"");
		
		System.out.println(hm.size()); // 
		System.out.println(hm);
		
		System.out.println(hm.get(null));
		/*String temp = "null";
		String temp1 = null;
		
		if(temp.equals(temp)) {}
		
		if(temp1 == null) {}*/
			
			
		
		
	}
}

