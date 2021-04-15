/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

package rahul_Hiremath.assignment_17;

public class Ass_17_3 {

	int positiveCount = 0;
	int negativeCount = 0;

	void checkIfPositive(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0)
				positiveCount++;
		}
	}

	void checkIfNegative(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0)
				negativeCount++;
		}
	}

	void displayCount() {
		System.out.println("Positive count is: " + positiveCount);
		System.out.println("Negative count is: " + negativeCount);
	}

	public static void main(String[] args) {
		Ass_17_3 ass_17_3 = new Ass_17_3();
		int[] array = { 10, 23, 26, -27, -88, 87, -65 };
		ass_17_3.checkIfPositive(array);
		ass_17_3.checkIfNegative(array);
		ass_17_3.displayCount();
	}
}
