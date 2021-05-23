package aashay.Test_12;
/*
 *  int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"]
output : 3

 */

import java.util.ArrayList;

public class ArrayListReplaceString {

	int replaceString(ArrayList<String> input, String targetName) {
		int cnt=0;
		for (int index = 0; index < input.size(); index++) {
			if (input.get(index).equals("Aashay")) {
				input.set(index, "Technocredits");
				cnt++;
			}
		}
		System.out.println(input);
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListReplaceString arrayListReplaceString = new ArrayListReplaceString();
		String targetName = "Aashay";
		ArrayList<String> input = new ArrayList<String>();
		String[] arr = new String[] { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		for (int index = 0; index < arr.length; index++) {
			input.add(index, arr[index]);
		}
		int outputCnt = arrayListReplaceString.replaceString(input, targetName);
		System.out.println("Loop iterated:"+outputCnt);

	}

}
