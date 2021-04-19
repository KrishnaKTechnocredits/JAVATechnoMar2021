/*Java Assignment 22:  16th April'2021

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
And so on.... -------------------------------

*/

package vaibhav.Assignment_22;

public class AllCharFreqInAll {

	void oneCharFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " ---> " + count + " times in " + str);
	}

	void allCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				oneCharFreq(str, ch);
			}
		}
		System.out.println("===========================");
	}

	void nameArr(String[] name) {
		for (int index = 0; index < name.length; index++) {
			allCharFreq(name[index]);
		}
	}

	public static void main(String[] args) {

		AllCharFreqInAll allCharFreqInAll = new AllCharFreqInAll();
		String[] name = { "raj", "aarya", "aavruti", "shruti" };
		allCharFreqInAll.nameArr(name);
	}
}
