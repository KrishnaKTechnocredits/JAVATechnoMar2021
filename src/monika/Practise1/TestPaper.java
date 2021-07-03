package monika.Practise1;

public class TestPaper {

	public double getPowerOfGivenNo(int num, int powerNum) {
		boolean flag = false;

		double temp = 1;
		if (num == 0 && powerNum == 0) {
			return 0;
		} else if (powerNum < 0) {
			flag = true;
		}

		for (int index = 1; index <= Math.abs(powerNum); index++) {
			temp = temp * num;

		}
		if (flag == true) {

			temp = 1/ temp;
		}

		return temp;
	}

	public static void main(String[] args) {
		TestPaper obj = new TestPaper();
		double result = obj.getPowerOfGivenNo(2, -3);
		System.out.println(result);
	}
}
