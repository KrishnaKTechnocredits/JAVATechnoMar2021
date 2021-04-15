package madhavi_Khasbage.ArrayPrograms;

/*
	Program 1:  From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
	output : even -> 3
	odd ->  array.length - evenCount
*/
public class CountOddEvenNumber {

	int evenCount, oddCount;

	void findCount() {
		int[] arr = { 10, 23, 26, 27, 88, 87, 65 };
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
	}

	public static void main(String[] args) {
		CountOddEvenNumber cntOddEven = new CountOddEvenNumber();
		cntOddEven.findCount();
		System.out.print("Even : " + cntOddEven.evenCount + "\nOdd : " + cntOddEven.oddCount);
	}
}
