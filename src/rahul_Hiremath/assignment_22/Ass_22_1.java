/*a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits*/

package rahul_Hiremath.assignment_22;

public class Ass_22_1 {

	void findCharFrq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println("The frequency of " + ch + " is " + count);
	}

	public static void main(String[] args) {

		Ass_22_1 ass_22_1 = new Ass_22_1();
		String word = "technocredits";
		char ch = 'e';
		ass_22_1.findCharFrq(word, ch);
	}
}
