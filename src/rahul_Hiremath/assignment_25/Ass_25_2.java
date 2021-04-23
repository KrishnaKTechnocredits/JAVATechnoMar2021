/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

package rahul_Hiremath.assignment_25;

public class Ass_25_2 {

	String[] nosInString(String[] array) {
		String[] output = new String[array.length];
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				char ch = array[i].charAt(j);
				if (Character.isDigit(ch))
					output[i] = array[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Ass_25_2 ass_25_2 = new Ass_25_2();
		String[] array = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] ans = ass_25_2.nosInString(array);
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] != null)
				System.out.println(ans[i]);
		}
	}
}
