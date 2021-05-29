/* Coding Exam - 12 : 22nd May'2021 [15 mins]

Programming Test - 12 : 

2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"]
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
*/

package vaibhav.CodingExam12;

import java.util.ArrayList;

public class CountAndReplace {

	int countNameAndReplace(ArrayList<String> input, String name, String replaceWith) {
		int count = 0;

		while (input.contains(name)) {
			int index = input.indexOf(name);
			input.set(index, replaceWith);
			count++;
		}

		return count;
	}

	public static void main(String args[]) {

		ArrayList<String> inputList = new ArrayList<String>();

		inputList.add("Vaibhav");
		inputList.add("Aashay");
		inputList.add("Prashant");
		inputList.add("Aashay");
		inputList.add("Aashay");
		inputList.add("Sandesh");

		String targetName = "Aashay";
		String replaceWith = "Technocredits";

		CountAndReplace countAndReplace = new CountAndReplace();

		System.out.println("ArrayList Before replace operation : ");
		System.out.println(inputList);
		int count = countAndReplace.countNameAndReplace(inputList, targetName, replaceWith);
		System.out.println(" ");
		System.out.println("ArrayList After replace operation : ");
		System.out.println("In given ArrayList " + targetName + " count is : " + count);
		System.out.println(inputList);

	}

}
