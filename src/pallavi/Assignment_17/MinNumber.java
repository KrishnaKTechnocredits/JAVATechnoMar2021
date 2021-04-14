package pallavi.Assignment_17;

public class MinNumber {

	int minNumber(int arr[]) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}
		return min;
	}

	public static void main(String[] args) {
		int a[] = { 22, 35, 65, 88, 11, 23, 45 };
		int number = new MinNumber().minNumber(a);
		System.out.println("Minuimum no " + number);

	}

}
