/*Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23*/

package rahul_Hiremath.assignment_25;

public class Ass_25_1 {

	void listOfPrimeNos(int start, int end) {
		int count = 0;
		boolean flag = true;
		for (; start <= end; start++) {
			for (int j = 2; j <= start / 2; j++) {
				if (start % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				count++;
				if (count <= 5)
					System.out.println(start);
			}
			flag = true;
		}
	}

	public static void main(String[] args) {
		Ass_25_1 ass_25_1 = new Ass_25_1();
		ass_25_1.listOfPrimeNos(10, 50);
	}

}
