package surabhi.collection_demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class ExampleStringMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<String, Integer>(4);
		hm.put(null, 1);
		hm.put("a", null);
		hm.put("b", 3);
		if(hm.containsKey("b"))
		hm.put("b", hm.get(null));
		hm.put("c", 30);
		hm.put("d", 10);
		System.out.println(hm);
		
	}

}
