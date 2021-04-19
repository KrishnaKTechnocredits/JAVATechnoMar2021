package sai.Assignment22;

/*
 * c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....

 */

public class AllCharFrequencyString {

	public static void main(String[] args) {
		AllCharFrequencyString allCharFrequencyString = new AllCharFrequencyString();
		String[] names = { "raj", "aarya", "aavruti", "shruti" };
		allCharFrequencyString.allCharFreqString(names);

	}

	void allCharFreqString(String[] names) {
		AllCharFrequency allCharFreq = new AllCharFrequency();
		int length = names.length;

		for (int i = 0; i < length; i++) {
			String str = names[i];
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (str.indexOf(ch) == index)
					allCharFreq.frequency(ch, str);
			}
		}
	}
}
