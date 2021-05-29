/*input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set*/
package prashant.coding_exam_12;

import java.util.ArrayList;

public class ArrListReplaceString {
	int countName(ArrayList<String> arr, String targetName) {
		int Cnt = 0;
		while (arr.contains(targetName)) {
			arr.set(arr.indexOf(targetName), "TechnoCredits");
			Cnt++;
		}
		return Cnt;
	}

	public static void main(String[] args) {
		ArrListReplaceString replace = new ArrListReplaceString();
		String[] strArr = { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		ArrayList<String> strArrList = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			strArrList.add(i, strArr[i]);
		}
		System.out.println("Before replacing Aashay in ArrayList " + strArrList);
		int ans = replace.countName(strArrList, "Aashay");
		System.out.println("Aashay Name in given ArrayList is " + ans + " times ");
		System.out.println("After replacing Aashay in ArrayList " + strArrList);
	}
}
