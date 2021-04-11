package madhavi_Raut.Assignment_17;
/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4*/

public class CountPositiveNegativeNumbers {
	void findcountPositiveNegativeNumbers(int[] num) {
		int countOfPositiveNumbers = 0;
		int countOfNegativeNumbers = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0)
				countOfPositiveNumbers++;
			else if (num[index] < 0)
				countOfNegativeNumbers++;
		}
		System.out.println("Count of Positive numbers from given array: " + countOfPositiveNumbers);
		System.out.println("Count of Negative numbers from given array: " + countOfNegativeNumbers);
	}

	public static void main(String[] args) {
		int[] num = { 10, 23, 26, -27, -88, 87, -65 };
		new CountPositiveNegativeNumbers().findcountPositiveNegativeNumbers(num);
	}
}
