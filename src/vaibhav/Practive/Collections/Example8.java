package vaibhav.Practive.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8 {

	static void getUniqueElements(String[] arr1, String[] arr2) {
		
		List<String> listOfArrr1 = Arrays.asList(arr1);
		List<String> listOfArrr2 = Arrays.asList(arr2);
		
		ArrayList<String> ArrList1 = new ArrayList<String>(listOfArrr1);
		ArrayList<String> ArrList2 = new ArrayList<String>(listOfArrr2);
		
		
		System.out.println("Before removeAll operation on ArrayList1 ");
		System.out.println(ArrList1);
		System.out.println(ArrList2);
		System.out.println("----------------------------------------------------");
	/*	
		boolean b1 = ArrList1.removeAll(ArrList2);
		System.out.println(b1);*/
		
		boolean b2 = ArrList2.retainAll(ArrList1);
		System.out.println(b2);
		
		System.out.println("After removeAll operation on ArrayList1 ");
		
		System.out.println("ArrayList 1 : " + ArrList1);
		System.out.println("ArrayList 2 : " + ArrList2);

	}

	public static void main(String[] args) {

	//	String[] arr1 = { "Maulik", "Aashvi", "Krishna" };
	//	String[] arr2 = { "Aashvi", "Techno", "Harsh", "Maulik" };
		
		String[] arr1 = { "a", "b", "c","d" };
		String[] arr2 = { "d", "c", "f", "g" };

		ArrayList<String> ArrList3 = new ArrayList<String>();

		getUniqueElements(arr1, arr2);

	}

}
