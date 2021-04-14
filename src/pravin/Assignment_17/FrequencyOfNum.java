/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

	package pravin.Assignment_17;
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
