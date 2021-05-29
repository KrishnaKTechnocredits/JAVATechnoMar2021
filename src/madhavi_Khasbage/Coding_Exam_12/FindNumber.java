package madhavi_Khasbage.Coding_Exam_12;
/*Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15

2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set

*/

import java.util.ArrayList;

public class FindNumber {
	static int cnt = 0;

	ArrayList<Integer> findNum(ArrayList<Integer> arr) {
		ArrayList<Integer> arrNum = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0) {
				arrNum.add(arr.get(index));
			}
		}
		return arrNum;
	}

	ArrayList<String> findAndReplaceString(ArrayList<String> arrStr, String strTargetName) {
		
		while(arrStr.contains(strTargetName)) {
			arrStr.set(arrStr.indexOf(strTargetName), "Technocredits");
			cnt++;
		}
		
		return arrStr;
	}

	public static void main(String[] args) {
		FindNumber objFindNumber = new FindNumber();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(15);
		arr.add(44);
		arr.add(30);
		System.out.println("Below  are the numbers divided by 3 or 5, 3 and 5:\n" + objFindNumber.findNum(arr) + "\n\n");

		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add("Madhavi");
		arrStr.add("Java");
		arrStr.add("DotNet");
		arrStr.add("SQL");
		arrStr.add("Madhavi");
		arrStr.add("Javascript");
		arrStr.add("JQuery");
		arrStr.add("Madhavi");
		
		System.out.println("Input: [Madhavi, Java, DotNet, SQL, Madhavi, Javascript, JQuery,Madhavi]");
		System.out.println("Replace Madhavi with Technocredits");

		System.out.println("Output: " + objFindNumber.findAndReplaceString(arrStr, "Madhavi"));
		System.out.println("Madhavi occurred count in arraylist : " + cnt);
	}
}
