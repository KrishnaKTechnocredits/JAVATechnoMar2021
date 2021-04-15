/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

package rahul_Hiremath.assignment_17;

public class Ass_17_9 {

	int stringLengthIndex(String[] array) {
		int max = 0;
		int finalIndex = 0;
		for (int index = 0; index < array.length; index++) {
			int length = array[index].length();
			if (max < length) {
				max = length;
				finalIndex = index;
			}
		}
		return finalIndex;
	}

	public static void main(String[] args) {
		Ass_17_9 ass_17_9 = new Ass_17_9();
		String[] array = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		int index = ass_17_9.stringLengthIndex(array);
		System.out.println("Max string is present at index: " + index);
	}
}
