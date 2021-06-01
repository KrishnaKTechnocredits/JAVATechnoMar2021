package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example13 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Shashank");
		hs.add("Sangita");
		hs.add("Sandesh");
		
		/*for(String name : hs) {
			if(name.length() > 6)
				hs.remove(name);
		}*/
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shashank");
		al.add("Sangita");
		al.add("Sandesh");
		
		System.out.println(al);
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next().length());
			System.out.println(itr1.next().length());
		}
	}
}
