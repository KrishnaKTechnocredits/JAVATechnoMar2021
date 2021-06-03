package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8 {
	
	static List<String> m1(){
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("Sandesh");
		list1.add("Shashank");
		return list1;
	}
	
	static void getUniqueElementFromList1(String[] arr1, String[] arr2) {
		/*List<String> listOfStr1 = Arrays.asList(arr1); // readOnly
		List<String> listOfStr2 = Arrays.asList(arr2);
		
		//listOfStr1.removeAll(listOfStr2);
*/		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
		
		list1.removeAll(list2);
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);	
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"Maulik", "Aashvi", "Krishna"};
		String[] arr2 = {"Aashvi", "TEchno", "Harsh", "Maulik"};
		getUniqueElementFromList1(arr1, arr2);
		
		List<String> temp = m1();
	}
}
