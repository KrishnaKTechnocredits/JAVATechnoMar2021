package shashank.array_17_18;

public class ArrayNumberPresent {

	public boolean isNumberPresent(int[] arr, int targetNum) {
		boolean isNumber = false;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == targetNum)
				isNumber = true;
		}
		return isNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 23, 23, 44, 23, 10, 23, 23, 23 };
		ArrayNumberPresent frequencyNum = new ArrayNumberPresent();
		int targetNum = 45;
		boolean numberPresent = frequencyNum.isNumberPresent(arr, targetNum);
		if (numberPresent)
			System.out.println("Number " + targetNum + " is present");
		else
			System.out.println("Number " + targetNum + " is not found");

	}

}
