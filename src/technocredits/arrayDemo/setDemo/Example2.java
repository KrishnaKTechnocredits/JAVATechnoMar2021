package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Maulik");
		
		Collection<String> temp = Collections.unmodifiableCollection(nameList);
		boolean b = temp.add("Kanani");
		System.out.println(b);
		
		
	}
}
