package sai.Assignment17;

/*
 * Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits

 */
public class StringLengthArray {

	public static void main(String[] args) {
		StringLengthArray stringLengthArray = new StringLengthArray();
		String[] names = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		stringLengthArray.stringLength(names);
	}

	void stringLength(String[] names) {
		int maxLength = names[0].length();
		String name = names[0];
		for (int index = 0; index < names.length; index++) {
			if (names[index].length() > maxLength) {
				maxLength = names[index].length();
				name = names[index];
			}
		}
		System.out.println("Max name length is " + name);
	}
}
