package madhavi_Raut.Assignment_22;

/*Assignment - 22 : 16th April'2021
Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
Input: name - technocredits
character - e
Output : e -> 2 time in technocredits
b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
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
And so on.... */
public class FindFrequenciesOfChars {

	void findFrequencyOfCharInString(String name, char ch) {
		int charCount = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				charCount++;
		}
		System.out.println("Frequency of " + ch + " in " + name + " is " + charCount);
	}

	void findFrequencyOfcharsInString(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (name.indexOf(ch) == index)
				findFrequencyOfCharInString(name, ch);
		}
	}

	void findFrequencyOfCharsInStringArray(String[] names) {
		for (int index = 0; index < names.length; index++) {
			findFrequencyOfcharsInString(names[index]);
			System.out.println("---------------------------------");
		}
	}

	public static void main(String[] args) {
		FindFrequenciesOfChars findFrequenciesOfChars = new FindFrequenciesOfChars();
		findFrequenciesOfChars.findFrequencyOfCharInString("technocredits", 'e');
		System.out.println();
		findFrequenciesOfChars.findFrequencyOfcharsInString("aakanksha");
		System.out.println();
		String[] names = { "raj", "aarya", "aavruti", "shruti" };
		findFrequenciesOfChars.findFrequencyOfCharsInStringArray(names);
	}
}
