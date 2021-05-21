package sai.Assignment22;

/*
 * ) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1

 */

public class AllCharFrequency {

	public static void main(String[] args) {
		AllCharFrequency allCharFrequency = new AllCharFrequency();
		allCharFrequency.checkIndex("aakanksha");
	}

	void frequency(char ch, String str) {
		int count = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " -> " + count + " time in " + str);
	}

	void checkIndex(String str) {

		int length = str.length();
		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				frequency(ch, str);
		}
	}
}