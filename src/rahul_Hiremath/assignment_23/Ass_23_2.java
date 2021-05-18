/*2) print all the prime numbers given range.
   input : 40 to 100*/

package rahul_Hiremath.assignment_23;

public class Ass_23_2 {

	void listOfPrimeNo(int start, int end) {
		boolean flag = true;
		for (; start <= end; start++) {
			for (int j = 2; j < start / 2; j++) {
				if (start % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(start);
				flag = false;
			}
			flag = true;
		}
	}

	public static void main(String[] args) {

		Ass_23_2 ass_23_2 = new Ass_23_2();
		ass_23_2.listOfPrimeNo(40, 100);
	}
}
