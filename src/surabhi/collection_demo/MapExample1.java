package surabhi.collection_demo;

import java.util.HashMap;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		Integer i=10, j=14;
		map.put(i, j);
		map.put(Integer.valueOf(1), Integer.valueOf(10));
		map.put('c', "Abc");
		map.put(6,"str");
		System.out.println(map);
	}

}
