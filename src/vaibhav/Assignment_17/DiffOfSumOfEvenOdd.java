package vaibhav.Assignment_17;

/*Program 2: return a difference between sum of even number and odd numbers.
 
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum

int getDifference(int[] input){
}

*/

public class DiffOfSumOfEvenOdd {

	int[] number = new int[8];
	int evenSum, oddSum, diffEvenOdd;

	int getDifference(int[] number) {
				
		for (int index = 0; index < number.length; index++) {
			if (number[index] % 2 == 0)
				evenSum = evenSum + number[index];
			else {
				oddSum = oddSum + number[index];
			}
		}
		diffEvenOdd = evenSum - oddSum;
		return diffEvenOdd;
	}

	public static void main(String[] args) {
		int[] number = { 10, 23, 26, 27, 88, 87, 65 };

		DiffOfSumOfEvenOdd evenOddCount = new DiffOfSumOfEvenOdd();
		// evenOddCount.getDifference(number);
		System.out.println(
				"Difference between sum of even number and odd numbers is : " + evenOddCount.getDifference(number));
	}
}
