package sai.Codingexam1;

public class ReturnIndices {

	public static void main(String[] args) {
		ReturnIndices returnIndices = new ReturnIndices();
		int[] arr = { 2, 11, 15, 7, 4 };
		returnIndices.addNumber(arr);
	}

	void addNumber(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[index] + arr[i] == 9) {
					System.out.println("Because the sum of " + "arr[" + index + "]" + "," + "arr[" + i + "] == 9"
							+ " hence we are the returning the indices as [" + index + "," + i + "]");
				}
			}
		}
	}
}
