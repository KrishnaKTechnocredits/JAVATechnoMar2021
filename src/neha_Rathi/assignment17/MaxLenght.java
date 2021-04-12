/*Assignment - 17
Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harshbbcccccbbbbbbbb"};
output : Technocredits
*/
package neha_Rathi.assignment17;

public class MaxLenght {

	String maxLenghtInput(String[] input) {
		String stringName = input[0];
		for (int index = 1; index < input.length; index++) {
			if (stringName.length() < input[index].length())
				stringName = input[index];
		}
		return stringName;
	}

	public static void main(String[] args) {
		MaxLenght maxLenght = new MaxLenght();
		String[] input = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		System.out.println(maxLenght.maxLenghtInput(input));
	}
}
