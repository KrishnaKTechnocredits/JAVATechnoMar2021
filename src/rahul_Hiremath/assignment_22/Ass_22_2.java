/*b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1*/

package rahul_Hiremath.assignment_22;

public class Ass_22_2 {

	void findCharFrq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println("The frequency of " + ch + " is " + count);
	}

	void allCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				findCharFrq(str, ch);
		}
	}

	public static void main(String[] args) {
		Ass_22_2 ass_22_2 = new Ass_22_2();
		String word = "aakanksha";
		ass_22_2.allCharFreq(word);
	}
}