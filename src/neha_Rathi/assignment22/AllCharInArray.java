//Assignment22
//c) Find all character frequency from each name given in String array.
//     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
//     Output : r -> 1 time in raj
//              a -> 1 time in raj
//              j -> 1 time in raj
//         =====================
//	     a -> 3 time in aarya
//             r -> 1 time in aarya
//              y -> 1 time in aarya
//         ====================
//         And so on....	-------------------------------

package neha_Rathi.assignment22;

public class AllCharInArray {
	void stringChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				freqOfAllChar(input, ch);
		}
	}

	void freqOfAllChar(String input, char ch) {
		int cnt = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				cnt++;
		}
		System.out.println(ch + " -> " + cnt + " time in " + input);
	}

	void iterateArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			stringChar(input[index]);
		}
	}

	public static void main(String[] args) {
		AllCharInArray allCharInArray = new AllCharInArray();
		String[] input = { "raj", "aarya", "aavruti", "shruti" };
		allCharInArray.iterateArray(input);
	}
}
