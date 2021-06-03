/*input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3*/

package krati_Jain.codingExam12;

import java.util.ArrayList;

public class ElementCountInArrayList {
	static int count;

	public static void main(String[] args) {

		String temp = "Aashay";
		String replaceWith = "Technocredits";
		String[] stringArr = { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		ArrayList<String> inputStrList = new ArrayList<String>();
		for (int index = 0; index < stringArr.length; index++) {
			inputStrList.add(stringArr[index]);
		}
		ElementCountInArrayList elementCountInArrayList = new ElementCountInArrayList();

		ArrayList<String> output = elementCountInArrayList.countElementInList(inputStrList, temp, replaceWith);
		System.out.println("Count of '" + temp + "' in the given array was : " + count + " which has been replaced by '"
				+ replaceWith + "'" + "\nOutput array is: " + output);
	}

	ArrayList<String> countElementInList(ArrayList<String> inputStrList, String temp, String replaceWith) {
		int index = 0;
		while (inputStrList.contains(temp)) {
			index = inputStrList.indexOf(temp);
			inputStrList.set(index, replaceWith);
			count++;
		}
		// System.out.println(count);
		return inputStrList;
	}

}
