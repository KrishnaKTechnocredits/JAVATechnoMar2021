package monika.Collections_ArrayList;

import java.util.ArrayList;
/*Programming Test - 12 : 22nd May'2021
1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.
input : [10,2,3,6,15,44,32] : output : 10,3,6,15 */

public class Collections_DivByGivenNum_Test12 {

	ArrayList<Integer> filterNum(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0) {
				output.add(arr.get(index));
			}
		}
		return output;
	}

	/*
	 * 2) int countName(ArrayList<String> arr, String targetName) []
	 * input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
	 * target name : Aashay Replace targetName with Technocredits output :
	 * ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits",
	 * "Anubhav"] output : 3
	 * Hint : Loop should be travesered only 3 times or occurance of target name.
	 * Hint : contains, indexOf, set
	 */

	int countName(ArrayList<String> arr, String targetName) {
		String inputName = "Technocredits";
		int count = 0;
		while (arr.contains(targetName)) {
			arr.set(arr.indexOf(targetName), inputName);
			count++;
		}
		System.out.println(arr);
		return count;
	}

	public static void main(String[] args) {
		Collections_DivByGivenNum_Test12 obj = new Collections_DivByGivenNum_Test12();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(15);
		arr.add(44);
		arr.add(32);
		ArrayList<Integer> outputResult = obj.filterNum(arr);
		System.out.println(outputResult);
		
		// New ArrayList for program 2
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
