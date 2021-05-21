package priyanka_Kamble.Assignment_17;

/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4*/

public class PositiveNigative {
	
	int positiveCount = 0, negativeCount;

	void positiveNumber(int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 0) {
				positiveCount++;
				System.out.println("");
				//return "Positive";
			} else {
				negativeCount++;
				//return "Negative";
			}
		}
		System.out.println("Positive Number Count - " + positiveCount);
		System.out.println("Negative Number Count - " + negativeCount);
	}

	public static void main(String[] args) {
		int[] array = { 10, 23, 26, -27, -88, 87, -65 };
		new PositiveNigative(). positiveNumber(array);
	}
}
