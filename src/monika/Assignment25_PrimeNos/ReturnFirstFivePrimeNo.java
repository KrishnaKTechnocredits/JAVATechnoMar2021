package monika.Assignment25_PrimeNos;

/*Assignment - 25 : 18th April'2021

Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23 */
public class ReturnFirstFivePrimeNo {
	int[] getPrimeNo(int startValue, int endValue) {
		int[] arr = new int[5];
		int count = 0;
		int temp = 0;
		boolean isPrimeFlag = true;
		for (; startValue < endValue; startValue++) {
			for (int index = 2; index < startValue; index++) {
				if (startValue % index == 0)
					isPrimeFlag = false;
			}
			if (isPrimeFlag && startValue > 1) {
				arr[count] = startValue;
				// System.out.println(arr[count]);
				count++;
				if (count == 5)
					break;
			} else
				isPrimeFlag = true;
		}
		return arr;
	}

	public static void main(String[] args) {
		ReturnFirstFivePrimeNo obj = new ReturnFirstFivePrimeNo();
		int[] arr = new int[5];
		arr = obj.getPrimeNo(1, 10);
		for (int index = 0; index < 5; index++)
			System.out.println(arr[index]);
	}
}
