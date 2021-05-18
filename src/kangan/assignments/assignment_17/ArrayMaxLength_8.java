package kangan.assignments.assignment_17;

public class ArrayMaxLength_8 {

	String getMaxLength(String[] input) {
		int max = input[0].length();
		String maxName = input[0];

		for (int index = 1; index < input.length; index++) {
			if (input[index].length() > max) {
				max = input[index].length();
				maxName = input[index];

			}
		}
		return maxName;

	}

	public static void main(String[] args) {
		String[] name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		ArrayMaxLength_8 arrayMaxLength = new ArrayMaxLength_8();
		String maxLength = arrayMaxLength.getMaxLength(name);
		System.out.println(maxLength);
	}

}
