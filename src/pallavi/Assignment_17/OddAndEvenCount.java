package pallavi.Assignment_17;

/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

public class OddAndEvenCount {


	void evenOddNum(int array[]) {
		int count = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0)
				count++;
		}
		System.out.println("Even Count is:" + count);
		int oddCount = array.length - count;
		System.out.println("Odd Count is " + oddCount);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 23, 26, 27, 88, 87, 65 };
		new OddAndEvenCount().evenOddNum(arr);
		;

	}

}
