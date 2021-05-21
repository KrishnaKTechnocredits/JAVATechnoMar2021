package sai.Assignment17;

/*
 * Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount

 */
public class OddEvenArray {

	public static void main(String[] args) {
		int[] numbers = { 10, 23, 26, 27, 88, 87, 65 };
		OddEvenArray oddEvenArray = new OddEvenArray();
		oddEvenArray.countOddEven(numbers);
	}

	void countOddEven(int[] numbers) {
		int evenCount = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] % 2 == 0)
				evenCount++;
		}
		System.out.println("Total even numbers are " + evenCount);
		System.out.println("Total odd numbers are " + (numbers.length - evenCount));

	}

}