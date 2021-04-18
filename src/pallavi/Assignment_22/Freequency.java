package pallavi.Assignment_22;

public class Freequency {
	/*
	 * Create a class with following functionality. [Estimated time: 40 mins] a)
	 * Find one character frequency from given name. Input: name - technocredits
	 * character - e Output : e -> 2 time in technocredits
	 * 
	 * b) Find all character frequency from given name. Input: name - aakanksha
	 * Output : a -> 4 k -> 2 n -> 1 s -> 1 h -> 1
	 * 
	 * c) Find all character frequency from each name given in String array. Input :
	 * Array -> {"raj", "aarya", "aavruti", "shruti"} Output : r -> 1 time in raj a
	 * -> 1 time in raj j -> 1 time in raj ===================== a -> 3 time in
	 * aarya r -> 1 time in aarya y -> 1 time in aarya ==================== And so
	 * on.... -------------------------------
	 */

	void freqOfTargetChar(String word, char targetChar) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {	
			char ch = word.charAt(index);
			if (ch == targetChar)
				count++;
		}

		System.out.println(targetChar + " -> " + count + " time in technocredits");
	}

	void allCharFrequency(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (index == word.indexOf(ch)) {
				freqOfTargetChar(word, ch);
			}
		}
	}

	void freOfArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("-----------------------------------------------------------------");
			allCharFrequency(arr[index]);
		}
		
	}

	public static void main(String[] args) {
		String name = "technocredits";
		String name1 = "aakanksha";
		String arr[] = { "raj", "aarya", "aavruti", "shruti" };
		Freequency freequency = new Freequency();
		 freequency.freqOfTargetChar(name, 'e');
		//freequency.allCharFrequency(name1);
		//freequency.freOfArray(arr);

	}

}
