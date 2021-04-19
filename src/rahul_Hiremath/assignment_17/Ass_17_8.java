/*Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

package rahul_Hiremath.assignment_17;

public class Ass_17_8 {

	void stringLengthMax(String[] str) {
		int max = 0;
		String maxString = null;
		for (int index = 0; index < str.length; index++) {
			int length = str[index].length();
			if (max < length) {
				max = length;
				maxString = str[index];
			}
		}
		System.out.println("Max length string is: " + maxString);
	}

	public static void main(String[] args) {

		Ass_17_8 ass_17_8 = new Ass_17_8();
		String[] array = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		ass_17_8.stringLengthMax(array);
	}
}
