package anubhav.arrayexamples;

/*WAP to find Second max from given array
		int[] arr = {10,33,43,55,97,11,3};
		ouput : 55
*/

public class SecondBiggestNumber {

	void secondBiggest(int[] input) {

		int biggest = input[0];
		int secondBiggest = input[1];

		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] < input[innerIndex]) {
					biggest = input[innerIndex];
					secondBiggest = input[index];
				}
			}
		}
		System.out.println("Biggest number in the array is        : " + biggest);
		System.out.println("Second biggest number in the array is : " + secondBiggest);
	}

	public static void main(String[] args) {
		SecondBiggestNumber secondBiggestNumber = new SecondBiggestNumber();
		int[] temp = { 10, 33, 43, 55, 97, 11, 3 };
		secondBiggestNumber.secondBiggest(temp);
	}
}
