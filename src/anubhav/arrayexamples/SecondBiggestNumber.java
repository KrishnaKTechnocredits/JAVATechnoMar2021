package anubhav.arrayexamples;

/*WAP to find Second max from given array
		int[] arr = {10,33,43,55,97,11,3};
		ouput : 55
		
		biggest: 11
		second biggest: 10
*/

public class SecondBiggestNumber {

	void secondBiggest(int[] input) {

		int biggest = input[0];
		int[] temp = new int[input.length - 1];
		int secondBiggest = temp[0];
		int tempIndexCount = 0;

		for (int index = 1; index < input.length; index++) {
			if (biggest < input[index]) {
				temp[tempIndexCount] = biggest;
				tempIndexCount++;
				biggest = input[index];
			} else {
				temp[tempIndexCount] = input[index];
				tempIndexCount++;
			}
		}

		for (int index = 1; index < temp.length; index++) {
			if (secondBiggest < temp[index]) {
				secondBiggest = temp[index];
			}
		}
		System.out.println("Second biggest number is : " + secondBiggest);
	}

	public static void main(String[] args) {
		SecondBiggestNumber secondBiggestNumber = new SecondBiggestNumber();
		int[] temp = { 110, 99, 463, 955, 98, 11, 300 };
		secondBiggestNumber.secondBiggest(temp);
	}
}
