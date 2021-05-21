/*Assignment - 25 : 18th April'2021

Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

package simmi.assignment_25;

public class ArrayString {
	public static void main(String[] args) {
		String[] input = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] output = new ArrayString().name(input);
		System.out.println("All string with atleast one number are");
		for (int index = 0; index < output.length; index++) {
			if (output[index] != null) {
				System.out.println(output[index]);
			}
		}
	}

	String[] name(String[] arr) {
		String[] output = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			String target = arr[index];
			for (int innerIndex = 0; innerIndex < target.length(); innerIndex++) {
				if (target.charAt(innerIndex) >= 48 && target.charAt(innerIndex) <= 57) {
					output[index] = target;
				}
			}
		}
		return output;
	}
}
