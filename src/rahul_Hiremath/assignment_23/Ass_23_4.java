package rahul_Hiremath.assignment_23;

public class Ass_23_4 {

	int count;
	int totalPrimeNoCount;

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
				totalPrimeNoCount = totalPrimeNoCount + start;
			}
			flag = true;
		}
		System.out.println("Total prime numbers count is: " + totalPrimeNoCount);
	}

	public static void main(String[] args) {

		Ass_23_4 ass_23_4 = new Ass_23_4();
		ass_23_4.listOfPrimeNo(2, 100);
	}
}
