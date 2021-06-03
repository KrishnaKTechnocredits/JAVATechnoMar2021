package sandesh.OWN_Practice_Sandesh_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsArrayList {

	public static void main(String[] args) {
		int[] inputArray = {1,3,4,7,9,10};
		Integer[] integerInputArray = {new Integer(1)};
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(integerInputArray));
		//List listOfIntegers = Arrays.asList(inputArray);
		//inputList = Arrays.asList(integerInputArray);
		
		boolean isAdded = false;
		//int xx = 10;
		ArrayList<String> namesList = new ArrayList<String>();
		System.out.println(isAdded); // false
		System.out.println(namesList.size()); // 0
		namesList.add("Butter");	// adds element to end and returns boolean
		namesList.add("Sugar");
		namesList.add("Honey");
		namesList.add("Bread");
		namesList.add("Gold");
		isAdded = namesList.add("Bread");
		System.out.println(isAdded); // true
		System.out.println(namesList); // [Butter, Sugar, Honey, Bread, Gold, Bread]
		//namesList.add(namesList.size()+2, "CAT"); //IndexOutOfBoundsException
		namesList.add(namesList.size(), "CAT"); // this will add CAT at the end coz index is size() of ArrayList
		System.out.println(namesList); // [Butter, Sugar, Honey, Bread, Gold, Bread, CAT]
		System.out.println(namesList.size()); // 7
		String caughtYou = namesList.set(4, "DOG"); // this will replace element at 4th index with DOG and throw the existing element at that index
		System.out.println(caughtYou); // Gold
		System.out.println(namesList); // [Butter, Sugar, Honey, Bread, DOG, Bread, CAT]
		System.out.println(namesList.get(2)); // Honey
		System.out.println(namesList.remove(2)); // removes element at index 2 and returns that element
		System.out.println(namesList); // [Butter, Sugar, Bread, DOG, Bread, CAT]
		System.out.println(namesList.contains("CAT")); // true
		System.out.println(namesList.indexOf("Bread") == namesList.lastIndexOf("Bread") ? "Unique" : "Duplicate"); // used ternary operator and print answer
		System.out.println(namesList.indexOf("Bread")); // 2
		System.out.println(namesList.lastIndexOf("Bread")); // 4
		//namesList.clear(); // clears all elements in one go. Return type is void
		//System.out.println(namesList); // []
		ArrayList<String> namesList1 = new ArrayList<String>();
		namesList1.add("Pencil");	// adds element to end and returns boolean
		namesList1.add("Eraser");
		namesList1.add("Pen");
		namesList1.add("Scale");
		namesList1.add("DOG");
		System.out.println(namesList1); // [Pencil, Eraser, Pen, Scale, DOG]
		namesList1.removeAll(namesList); // Remove the overlapping part from set theory wala concept
		System.out.println("*** PRINTING -> namesList1.removeAll(namesList); ***");
		System.out.println(namesList1); // [Pencil, Eraser, Pen, Scale]
		namesList1.addAll(namesList);
		System.out.println("*** PRINTING -> namesList1.addAll(namesList); ***");
		System.out.println(namesList1); // [Pencil, Eraser, Pen, Scale, Butter, Sugar, Bread, DOG, Bread, CAT]
		// so with addAll, everything gets appended, AS IT IS
		//namesList.clear();
		//System.out.println("namesList.clear();");
		//System.out.println(namesList); // []
		//System.out.println(namesList1.addAll(namesList)); // false
		System.out.println("*** PRINTING namesList ***");
		System.out.println(namesList);
		namesList1.retainAll(namesList);
		System.out.println("*** PRINTING -> namesList1.retainAll(namesList); ***");
		System.out.println(namesList1); // [Butter, Sugar, Bread, DOG, Bread, CAT]
	}
}
