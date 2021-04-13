package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;
/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/
public class FrequencyTargetNumScanner {

	int cntTarget;

	void findCount(int[] arr, int numTarget) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == numTarget) {
				cntTarget++;
			}
		}
	}

	public static void main(String[] args) {
		FrequencyTargetNumScanner frqNum = new FrequencyTargetNumScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}

		System.out.println("Enter target number:");
		int tNum = scanner.nextInt();

		frqNum.findCount(array, tNum);
		System.out.println("Frequency of " + tNum + " is " + frqNum.cntTarget);
		scanner.close();
	}

}
