/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d*/

package rahul_Hiremath.assignment_24;

public class Ass_24_1 {

	void middleCharOfEachString(String str) {
		if (str.length() % 2 == 0) {
			int middle = str.length() / 2 - 1;
			System.out.print(str.charAt(middle) + " ");
		}
		if (str.length() % 2 != 0) {
			int middle = str.length() / 2;
			System.out.print(str.charAt(middle) + " ");
		}
	}

	void getString(String[] array) {
		for (int i = 0; i < array.length; i++) {
			middleCharOfEachString(array[i]);
		}
	}

	public static void main(String[] args) {

		Ass_24_1 ass_24_1 = new Ass_24_1();
		String[] array = { "Techno", "Hello", "Credits" };
		ass_24_1.getString(array);
	}
}
