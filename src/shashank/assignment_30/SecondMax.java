package shashank.assignment_30;

public class SecondMax {

	void secondmax(int[] array) {
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		// System.out.println(first);
		for (int index = 0; index < array.length; index++) {
			if (array[index] > max) {
				secondMax = max;
				max = array[index];
			} else if (array[index] > secondMax && array[index] != max) {
				secondMax = array[index];
			}
		}
		System.out.println("Second larget number of given array " + secondMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondMax secondMax = new SecondMax();
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		secondMax.secondmax(arr);

	}

}
