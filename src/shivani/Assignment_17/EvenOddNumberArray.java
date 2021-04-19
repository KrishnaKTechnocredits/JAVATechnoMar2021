package shivani.Assignment_17;

/*Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

public class EvenOddNumberArray {

	void number() {

		int evenCount = 0;
		int[] numList = { 10, 23, 26, 27, 88, 87, 65 };

		for (int index = 0; index < numList.length; index++) {

			if (numList[index] % 2 == 0) {
				evenCount++;
			}

		}
		System.out.println("even :" + evenCount);
		System.out.println("odd:" + (numList.length - evenCount));
	}

	public static void main(String[] args) {

		EvenOddNumberArray oddEvennumbers = new EvenOddNumberArray();

		oddEvennumbers.number();
	}

}
