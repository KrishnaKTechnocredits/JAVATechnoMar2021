package monali.coding_exam_7_30mins;

public class SumOfMissingNumber {

	int missNumber(int[] arr) {
		int sum = 0;
		for (int index = 1; index <= 10; index++) {
			boolean isnumpresent = false;
			for (int i = 0; i < arr.length; i++) {
				if (index == arr[i]) {
					isnumpresent = true;
					
				}
			}
			

			if (isnumpresent == false) {
				System.out.println("missing number is " +index);
			sum = sum + index;
		}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		SumOfMissingNumber num = new SumOfMissingNumber();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		num.missNumber(arr);
	}
}
