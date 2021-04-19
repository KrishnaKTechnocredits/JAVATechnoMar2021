package dhanshri.Assignment_22;

public class OneCharFreq {

	void stringcharfreq(String input, char tChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == tChar)
				count++;
		}
		System.out.println("Frequency of target charater " + tChar + " in " + input + " is " + count);
	}

	void getAllCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				stringcharfreq(str, str.charAt(index));
		}

	}

	void arrayCharFreq(String[] names) {
		for (int index = 0; index < names.length; index++) {
			getAllCharFreq(names[index]);
		}

	}

	public static void main(String[] args) {
		OneCharFreq oneCharFreq = new OneCharFreq();
		System.out.println("===================Frequency of target character in String is============== ");
		oneCharFreq.stringcharfreq("Technocredits", 'e');

		System.out.println("=====Frequency of each caharcter in string===========================");
		oneCharFreq.getAllCharFreq("aakanksha");

		System.out.println("================Frequeny of single character in each input of array===============");
		String[] names = { "raj", "aarya", "aavruti", "shruti" };
		oneCharFreq.arrayCharFreq(names);

	}
}
