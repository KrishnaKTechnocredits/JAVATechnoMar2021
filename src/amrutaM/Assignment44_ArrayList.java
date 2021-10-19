package amrutaM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Program 1: 
	Find out the max number from an ArrayList.
	input: [10,7,99,53,74]
	output: 99

Program 2: 
	Practice Program : remove all occurrences of Amruta
	input : ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
	output :  ["Techno","Chandni","Parthav", "Mayur","Credits"]*/

public class Assignment44_ArrayList {

	static void getMaxNumber(ArrayList<Integer> input, int numIndex) {
		Collections.sort(input);
		System.out.println("Max number is --> " + input.get(input.size() - numIndex));
	}

	static void getMaxWithoutCollection(Integer[] numbers) {
		int max = 0;
		/*
		 * Arrays.sort(numbers); System.out.println(Arrays.toString(numbers));
		 * System.out.println("---------------------------------");
		 */
		// we can also use enhanced for loop
		for (int index = 0; index < numbers.length; index++) {
			if (max < numbers[index]) {
				max = numbers[index];

			}
		}
		System.out.println("Max number without collection is --> " + max);
	}

	// program 2 : input :
	// ["Techno","Chandni","Amruta","Parthav","Mayur","Amruta","Credits","Amruta"]
	static void removeAmruta(ArrayList<String> names) {

		while (names.contains("Amruta")) {
			names.remove("Amruta");
		}
		System.out.println(names);
	}

	static void removeAmrutaMethod2(ArrayList<String> names) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Amruta");
		
		names.removeAll(name);
		System.out.println(names);
		
	}

	public static void main(String[] args) {
		Integer[] numbers = { 10, 7, 99, 53, 74 };
		String[] names = { "Techno", "Chandni", "Amruta", "Parthav", "Mayur", "Amruta", "Credits", "Amruta" };
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(names));
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(numbers));
		// getMaxNumber(input, 2);
		// getMaxWithoutCollection(numbers);
		removeAmruta(namesList);
		removeAmrutaMethod2(namesList);
	}
}
