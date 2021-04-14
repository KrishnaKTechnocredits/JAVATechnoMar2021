/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/
	package pravin.Assignment_17;
	
	import java.util.Scanner;
	
	public class ArrayMaxNumber {
	
		int numFrequency(int[] input) {
			int maxNum = input[0];
	
			for (int index = 0; index < input.length; index++) {
				if (input[index] > maxNum)
					maxNum = input[index];
			}
			return maxNum;
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
			scanner.close();
			int num = new ArrayMaxNumber().numFrequency(array);
			System.out.println("Max num of given array is  " + num);
		}
	}
