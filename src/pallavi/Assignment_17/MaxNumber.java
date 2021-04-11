package pallavi.Assignment_17;

public class MaxNumber {

	int maxNumber(int arr[]) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { 22, 35, 65, 88, 11, 23, 45 };
		int number = new MaxNumber().maxNumber(a);
		System.out.println("Maximun no " + number);

	}

}
