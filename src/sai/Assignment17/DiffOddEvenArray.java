package sai.Assignment17;

/*
 * Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	int getDifference(int[] input){
	
	}

 */

public class DiffOddEvenArray {

	public static void main(String[] args) {

		int[] num = { 10, 23, 26, 27, 88, 87, 65 };
		DiffOddEvenArray diffOddEvenArray = new DiffOddEvenArray();
		diffOddEvenArray.getDifference(num);
	}

	void getDifference(int[] num) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0)
				sumEven = sumEven + num[index];
			else
				sumOdd = sumOdd + num[index];
		}
		if (sumEven > sumOdd) {
			System.out.println("Difference is " + (sumEven - sumOdd));
		} else {
			System.out.println("Difference is " + (sumOdd - sumEven));
		}

	}

}
