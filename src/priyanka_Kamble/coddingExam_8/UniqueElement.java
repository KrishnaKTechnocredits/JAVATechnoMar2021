package priyanka_Kamble.coddingExam_8;

/*
 * Programming Test - 8 :
Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 */
public class UniqueElement {

	int[] findUniqueElement(int[] array) {

		int[] output = new int[array.length];
		int outputindex = 0;

		for (int index = 0; index < array.length; index++) {
			boolean isUnique = false;
			for (int innerIndex = index + 1; innerIndex < array.length; innerIndex++) {
				if (array[index] == array[innerIndex]) {
					isUnique = true;
				}
			}
			if (!isUnique) {
				output[outputindex] = array[index];
				outputindex++;

			}
		}
		return output;
	}

	public static void main(String[] args) {
		int array[] = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] result = new UniqueElement().findUniqueElement(array);
		System.out.println(" Input Array =  10, 2, 3, 10, 3, 55, 61, 2 ");
		System.out.println(" Output Array -  ");
		for (int index = 0; index < result.length && result[index] != 0; index++) {
			System.out.println("  " + result[index]);
		}
	}
}
