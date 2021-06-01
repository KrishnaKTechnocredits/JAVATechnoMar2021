package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example15 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(3);
		al.add(44);
	
		al.get(55);
		//al.remove(Integer.valueOf(44));
		al.remove(new Integer(44));
		System.out.println(al);
	}
}
