/* int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set*/

package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam12_P2 {
	static int count;

	int countName(ArrayList<String> arr, String targetNum) {
		while (arr.contains(targetNum)) {
			arr.set(arr.indexOf(targetNum), "Technocredits");
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		CodingExam12_P2 codingExam12_P2 = new CodingExam12_P2();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Vaibhav");
		arr.add("Ashay");
		arr.add("Prashant");
		arr.add("Ashay");
		arr.add("Ashay");
		arr.add("Anubhav");
		int count = codingExam12_P2.countName(arr, "Ashay");
		System.out.println("output array is " + arr);
		System.out.println("Count of Ashay in an arra is " + count);
	}
}
