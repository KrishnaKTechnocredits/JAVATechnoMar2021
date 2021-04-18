/*Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

	package pravin.Assignment_17;
	import java.util.Scanner;
	
	public class ArrayMinNumber {
	
		int minNumOfArray(int[] input) {
			int minNum = input[0];
	
			for (int index = 0; index < input.length; index++) {
				if (input[index] < minNum)
					minNum = input[index];
			}
			return minNum;
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
			int num = new ArrayMinNumber().minNumOfArray(array);
			System.out.println("Minimum num of given array is  " + num);
		}
	}
