package dhanshri.Assignment_17;


import java.util.Scanner;

public class FrequencyOfNum {

	int numFrequency(int[] input, int target) {
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] == target)
				count++;
			
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array lenth:");

		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("enter elements of an  array");

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter target number: ");
		int tNum = scanner.nextInt();
		scanner.close();
		int numFreq = new FrequencyOfNum().numFrequency(array, tNum);
		System.out.println("Frequency of target num is " + numFreq);

	}
}
