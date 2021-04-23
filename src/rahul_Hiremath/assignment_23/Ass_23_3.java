/*3) count all the prime numbers given range.
   input : 2 to 100*/

package rahul_Hiremath.assignment_23;

public class Ass_23_3 {

	int count;

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
				flag = false;
				count++;
			}
			flag = true;
		}
		System.out.println("Total prime numbers count is: " + count);
	}

	public static void main(String[] args) {

		Ass_23_3 ass_23_3 = new Ass_23_3();
		ass_23_3.listOfPrimeNo(2, 100);
	}
}
