/*Assignment - 17 : 10th April'2021

Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}*/

package rashmi.Assignment_17;

public class DiffOfEvenOdd {

	int getDifference(int[] num) {
		int evenSum = 0, oddSum = 0, diff;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenSum = evenSum + num[index];
			} else {
				oddSum = oddSum + num[index];
			}
		}
		diff = evenSum - oddSum;
		return diff;

	}

	public static void main(String[] args) {
		int[] num = { 22, 9, 0, 88, 6, 8, 13, 11 };
		DiffOfEvenOdd diffOfEvenOdd = new DiffOfEvenOdd();
		int temp = diffOfEvenOdd.getDifference(num);
		System.out.println("Difference between sum of even and odd numbers is " + temp);

	}
}
