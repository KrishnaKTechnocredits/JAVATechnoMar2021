/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/

package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class IndexHavingMaxLength {
	void getIndexWithMaxLength(String[] name) {
		int maxindex = 0;
		for (int index = 0; index < name.length; index++) {
			if (name[maxindex].length() < name[index].length()) {
				maxindex = index;
			}

		}
		System.out.println("Index having Maximum Length is :-" + maxindex);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input1 = new String[5];
		IndexHavingMaxLength indexHavingMaxLength = new IndexHavingMaxLength();
		System.out.println("Enter Names");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextLine();
		}
		indexHavingMaxLength.getIndexWithMaxLength(input1);
		scanner.close();

	}
}
