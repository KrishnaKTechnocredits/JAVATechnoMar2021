/*Assignment - 17
	Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
	*/
package neha_Rathi.assignment17;

public class IndexOfMaxInput {
	int maxLenghtInput(String[] input) {
		String stringName = input[0];
		int indexNum=0;
		for (int index = 1; index < input.length; index++) {
			if (stringName.length() < input[index].length())
				indexNum = index;
		}
		return indexNum;
	}

	public static void main(String[] args) {
		IndexOfMaxInput indexOfMaxInput = new IndexOfMaxInput();
		String[] input = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		System.out.println(indexOfMaxInput.maxLenghtInput(input));
	}
}
