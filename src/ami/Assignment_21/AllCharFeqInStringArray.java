/*
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
         And so on....	-------------------------------

 */

package ami.Assignment_21;

public class AllCharFeqInStringArray {
	int count = 0;

	void feqOfChar(String input, char ch) {
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequence of " + ch + " :" + count);
	}

	void allCharFreq(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (index == word.indexOf(ch))
				feqOfChar(word, word.charAt(index));
		}
	}

	void nameArr(String[] name) {
		for (int index = 0; index < name.length; index++) {
			allCharFreq(name[index]);
		}
	}

	public static void main(String[] a) {
		AllCharFeqInStringArray allCharFeqInStringArray = new AllCharFeqInStringArray();
		String[] arr1 = { "raj", "aarya", "aavruti", "shruti" };
		allCharFeqInStringArray.nameArr(arr1);
	}

}
