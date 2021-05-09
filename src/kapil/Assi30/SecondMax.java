package kapil.Assi30;

public class SecondMax {

	void getSecondMax(int[] arr) {
		int max = arr[0];
		int secondmx = arr[1];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index]) {
				secondmx = max;
				max = arr[index];
			}
		}
		System.out.println("Second maximum number = " + secondmx);
	}

	public static void main(String[] args) {
		SecondMax secondmax = new SecondMax();
		int[] array = { 10, 33, 43, 55, 97, 11, 3 };
		secondmax.getSecondMax(array);
	}

}
