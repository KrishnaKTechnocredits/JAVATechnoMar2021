package sandesh.OWN_Practice_Sandesh_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HS_LinkedHashSetExample {

	List<String> m1() {
		List<String> ls1 = new ArrayList<String>();
		ls1.add("San");
		ls1.add("mol");
		return ls1;
	}
	
	Set<String> m2() {
		Set<String> set2 = new HashSet<String>();
		set2.add("San");
		set2.add("mol");
		return set2;
	}
	
	
	public static void main(String[] args) {
		String[] namesArray = {"Ankit", "Prachi", "Monika", "Shashank", "Sandesh",
								"Vaibhav", "Vaibhav", "1", "1", "*", "0"};
		
		List<String> listExample = new ArrayList<String>(Arrays.asList(namesArray));
		System.out.println("Ab aaya List wa");
		System.out.println(listExample);
		
		
		HashSet<String> hashSetExample = new HashSet<String>(Arrays.asList(namesArray));
		System.out.println("Ab aaya HashSet");
		System.out.println(hashSetExample);
		
		LinkedHashSet<String> linkedHashSetExample = new LinkedHashSet<String>(Arrays.asList(namesArray));
		System.out.println("Ab aaya LinkedHashSet");
		System.out.println(linkedHashSetExample);
		
		TreeSet<String> treeSetExample = new TreeSet<String>(Arrays.asList(namesArray));
		System.out.println("Ab aaya TreeSet");
		System.out.println(treeSetExample);
	}
}
