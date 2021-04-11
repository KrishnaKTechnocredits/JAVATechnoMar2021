/*Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/

package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class NameHavingMaxLength {

	void getNameWithMaxLength(String[] name) {
		String name1 = name[0];
		int maxindex = 0;
		for (int index = 0; index < name.length; index++) {
			if (name[maxindex].length() < name[index].length()) {
				maxindex = index;
				name1 = name[maxindex];
			}

		}
		System.out.println("Name having Maximum Length is :-" + name1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input1 = new String[5];
		NameHavingMaxLength nameHavingMaxLength = new NameHavingMaxLength();
		System.out.println("Enter Names");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextLine();
		}
		nameHavingMaxLength.getNameWithMaxLength(input1);
		scanner.close();

	}
}
