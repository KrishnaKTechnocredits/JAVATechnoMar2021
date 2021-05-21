package shivani.Assignment_22;

/*Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
         k -> 2
         n -> 1
         s -> 1
         h -> 1*/
public class FindAllCharFrequency {

	void singleCharFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " --> " + count + " times in " + str);
	}

	void allCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				singleCharFreq(str, str.charAt(index));
		}
	}

	public static void main(String[] args) {
		FindAllCharFrequency allcharFrequency = new FindAllCharFrequency();
		String name = "aakanksha";
		allcharFrequency.allCharFreq(name);
	}
}
