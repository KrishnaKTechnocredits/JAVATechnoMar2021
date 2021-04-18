/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

package pravin.Assignment_17;
import java.util.Scanner;

public class MaxLengthNameIndex {

	int nameLength(String[] input) {
		int maxIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[maxIndex].length() < input[index].length()) {
				maxIndex = index;
			}
		}
		return maxIndex;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array lenth:");
		int size = scanner.nextInt();
		String[] array = new String[size];
		System.out.println("enter elements of an  array");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.next();
		}
		scanner.close();
		int nameIndex = new MaxLengthNameIndex().nameLength(array);
		System.out.println("Max name index is :" + nameIndex);
	}
}
