/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

package rahul_Hiremath.assignment_25;

public class Ass_25_3 {

	void digitsInString(String[] array) {
		int sum = 0;
		int[] output = new int[array.length];
		for (int index = 0; index < output.length; index++) {
			for (int j = 0; j < array[index].length(); j++) {
				char ch = array[index].charAt(j);
				if (Character.isDigit(ch)) {
					int num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				}
			}
			System.out.print(" " +sum);
			sum = 0;
		}
	}
	
	public static void main(String[] args) {
		Ass_25_3 ass_25_3 = new Ass_25_3();
		String[] array = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		ass_25_3.digitsInString(array);
	}
}
