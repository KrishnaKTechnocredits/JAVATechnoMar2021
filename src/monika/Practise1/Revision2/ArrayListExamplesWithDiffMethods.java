package monika.Practise1.Revision2;
/*ArrayList Methods:
1) boolean add(Object obj)
2) int size()
3) Object get(int index)
4) Object remove(int index)
5) void add(int index, Object obj)
6) Object set(int index, Object obj)
7) boolean contains(Object obj)*/

import java.util.ArrayList;

public class ArrayListExamplesWithDiffMethods {

	void example1(ArrayList arr) {
		int lengthOfArr = arr.size();
		System.out.println("Length of an array list : " + lengthOfArr);// 5
		System.out.println(arr); // [Monika, 1, 10.1, true, a]
		/*
		 * for(int index=0;index<arr.size();index++) {
		 * System.out.println(arr.get(index)); }
		 */

		arr.set(1, "Gagan");
		System.out.println(arr.get(1)); // Gagan
		System.out.println(arr.remove("Sonika")); // true

		System.out.println(arr);// [Gagan, 10.1, true, a]

	}

	/*
	 * Programming Test - 12 : 22nd May'2021
	 * 
	 * 1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins] all the
	 * numbers, which is div by 3 or by 5 OR by 3 & 5.
	 * 
	 * input : [10,2,3,6,15,44,32] output : 10,3,6,15
	 */

	ArrayList<Integer> filterNum(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0) {
				output.add(arr.get(index));
			}
		}
		return output;
	}

/*	2) int countName(ArrayList<String> arr, String targetName) []

			input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
			target name : Aashay 
			Replace targetName with Technocredits
			output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
			output : 3

			Hint : Loop should be travesered only 3 times or occurance of target name.
			Hint : contains, indexOf, set*/
	
	int countName(ArrayList<String> arr, String targetName) {
		String inputName = "Technocredits";
		int count = 0;
		while(arr.contains(targetName)) {
			arr.set(arr.indexOf(targetName), inputName);
			count++;
		}
		System.out.println(arr);
		return count;	
	}

	public static void main(String[] args) {
		ArrayListExamplesWithDiffMethods obj = new ArrayListExamplesWithDiffMethods();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(15);
		arr.add(44);
		arr.add(32);
	//	obj.example1(arr);
		ArrayList<Integer> outputResult = obj.filterNum(arr);
		System.out.println(outputResult);
		
		
		
		
		ArrayList<String> targetNameArr = new ArrayList<String>();
		targetNameArr.add("Monika");
		targetNameArr.add("Aashay");
		targetNameArr.add("Mom");
		targetNameArr.add("Dad");
		targetNameArr.add("Aashay");
		targetNameArr.add("Brother");
		targetNameArr.add("Aashay");
		targetNameArr.add("Niece");

		int i = obj.countName(targetNameArr, "Aashay");
		System.out.println(i);
	}

}
