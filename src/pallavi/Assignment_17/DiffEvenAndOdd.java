package pallavi.Assignment_17;

/* difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
*/
public class DiffEvenAndOdd {

	int getDifference(int[] array) {
		int evenSum = 0, oddSum = 0, diff = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0) {
				evenSum = evenSum + array[index];
			} else {
				oddSum = oddSum + array[index];
			}

			diff = evenSum - oddSum;
		}
		return diff;
	}

	public static void main(String[] args) {

		int[] a = { 10, 23, 26, 27, 88, 87, 65 };
		int difference = new DiffEvenAndOdd().getDifference(a);
		System.out.println("Diffrence between sum of even and odd numbers are: " + difference);

	}

}
