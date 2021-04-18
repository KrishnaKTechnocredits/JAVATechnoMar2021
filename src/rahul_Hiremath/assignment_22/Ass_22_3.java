/*c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....	-------------------------------*/

package rahul_Hiremath.assignment_22;

public class Ass_22_3 {

	void findCharFrq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " -> " + count + " time in " + str);
	}

	void allCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				findCharFrq(str, ch);
		}
	}

	void iterateArray(String[] array) {
		for (int index = 0; index < array.length; index++) {
			String str = array[index];
			allCharFreq(str);
			System.out.println("=========================");
		}
	}

	public static void main(String[] args) {

		Ass_22_3 ass_22_3 = new Ass_22_3();
		String[] array = { "raj", "aarya", "aavruti", "shruti" };
		ass_22_3.iterateArray(array);
	}
}
