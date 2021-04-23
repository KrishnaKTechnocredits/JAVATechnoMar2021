package shashank_array_17_18;

public class ArrayMinNumber {

	int min;

	public void arrayMinNumber(int[] arr) {
		min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < min) {
				min = arr[index];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 23, 67, 44, -23, 0, 23, 89, -23 };
		ArrayMinNumber minNumber = new ArrayMinNumber();
		minNumber.arrayMinNumber(arr);
		System.out.println("Minimum number of array is " + minNumber.min);
	}

	}


