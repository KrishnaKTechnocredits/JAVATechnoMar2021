
package vaibhav.Practive.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example9 {

	public static void main(String[] args) {

		String[] Arr = { "Aashvi", "Techno", "Harsh", "Maulik", "Vaibhav" };

		List<String> nameList = Arrays.asList(Arr);

		for (Object names : nameList) {
			if (((String) names).contains("i"))
				System.out.println(names);
		}
		System.out.println("------------------------------");

		ArrayList<Integer> numberList = new ArrayList<Integer>();

		numberList.add(10);
		numberList.add(55);
		numberList.add(16);
		numberList.add(59);
		numberList.add(31);
		numberList.add(45);

		/*
		 * for (Integer num : numberList) { if (num > 15) numberList.remove(new Integer
		 * (num)); System.out.println(num);
		 * 
		 * }
		 */

		System.out.println(numberList);
		System.out.println();
		for (int index = 0; index < numberList.size(); index++) {
			System.out.println("Index : " + index+ " & Index value : " + numberList.get(index));
			if (numberList.get(index) > 15)
				numberList.remove(index);
			System.out.println(numberList); 
			System.out.println();
		}
		//System.out.println(numberList); 

	}

}
