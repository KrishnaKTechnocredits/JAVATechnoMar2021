package sandesh.coding_exam_8;

public class FibonacciSeries {

	private int[] getSeriesUptoEight(int limit) {
		int sum = 0;
		int firstNum = 0;
		int secondNum = 1;
		int[] fiboArray = new int[limit];
		fiboArray[0] = 0;
		fiboArray[1] = 1;
		for (int index = 2; index < limit; index++) {
			sum = firstNum + secondNum;
			fiboArray[index] = sum;
			firstNum = secondNum;
			secondNum = sum;
		}
		return fiboArray;
	}

	public static void main(String[] args) {
		int limit = 8;
		int fibonnaciSeries[] = new FibonacciSeries().getSeriesUptoEight(limit);
		System.out.println("Fibonacci Series upto limit " + limit + " is -: ");
		for (int index = 0; index < fibonnaciSeries.length; index++) {
			System.out.println(fibonnaciSeries[index]);
		}
	}
}
