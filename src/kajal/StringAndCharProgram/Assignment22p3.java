/*
 * Assignment - 22 : 16th April'2021
c) Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
Output : r -> 1 time in raj
a -> 1 time in raj
j -> 1 time in raj
=====================
a -> 3 time in aarya
r -> 1 time in aarya
y -> 1 time in aarya
====================
 */

package kajal.StringAndCharProgram;

public class Assignment22p3 {
 
	void allCharFrequency(String[] nameList) {

		for (int index = 0; index < nameList.length; index++) {
			String name = nameList[index];
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
				char c = name.charAt(innerIndex);
				if (name.indexOf(c) == innerIndex) {
					frequencyOfTargetChar(name, name.charAt(innerIndex));
				}
			}
			System.out.println("-----------------------------");

		}

	}

	void frequencyOfTargetChar(String name, char targetChar) {
		int targetCnt = 0;

		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == targetChar) {
				targetCnt++;
			}
		}
		System.out.println("Frequency of "+ targetChar+ " in name " + name+ " is "+ targetCnt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment22p3 assign = new FrequencyOfChar_Array();
		String nameList[] = { "raj", "aarya", "aavruti", "shruti" };
		new Assignment22p3().allCharFrequency(nameList);

	}
}
