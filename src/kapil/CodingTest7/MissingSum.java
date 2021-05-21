//WAP return sum of all missing number from given array.
//range : 1 to 10
//input : {1,3,4,7,9,10};
//output :21

package kapil.CodingTest7;

public class MissingSum {

	void getSumMissingInt(int[] array) {

		{
			int sum = 0;
			for (int number = 1; number <= 10; number++) {
				boolean isNumPresent = false;
				for (int index = 0; index < array.length; index++)
					if (number == array[index]) {
						isNumPresent = true;
						break;
					}
				if (isNumPresent == false)
					sum = sum + number;

			}
			System.out.println("Missing Num " + sum);
		}

	}

	public static void main(String[] args) {
		MissingSum missingsum = new MissingSum();
		int[] array = { 1, 3, 4, 7, 9, 10 };
		missingsum.getSumMissingInt(array);
	}

}
