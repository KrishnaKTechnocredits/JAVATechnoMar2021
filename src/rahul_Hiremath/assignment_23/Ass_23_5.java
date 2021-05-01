package rahul_Hiremath.assignment_23;

public class Ass_23_5 {
	int count;
	int totalPrimeNoCount;
	double avg;
	
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
				totalPrimeNoCount = totalPrimeNoCount + start;
			}
			flag = true;
		}
		avg = totalPrimeNoCount/count;
		System.out.println("Average is: " + avg);
	}

	public static void main(String[] args) {

		Ass_23_5 ass_23_5 = new Ass_23_5();
		ass_23_5.listOfPrimeNo(2, 100);
	}
}