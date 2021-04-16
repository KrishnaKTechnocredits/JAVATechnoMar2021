
//program 5: return true if you find a target number from given array else return false.
//input : 10,23,23,44,23,10,23,4,23
//target number : 45
//output : Number 45 doesnt found in given array.

package kapil.Array;

import java.util.Scanner;

public class BooleanNo {



	boolean getFreqNum(int[] input ) {
		
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 23)
				
			{ Scanner scanner = new Scanner(System.in);
			System.out.println("Target number : ");
			int no = scanner.nextInt();
			System.out.println("Target number found : " + input);
			return true;
		}
	}
		return false;}

	public static void main(String[] args) {
		FreqNo freqNo = new FreqNo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to enter ?");
		int size = scanner.nextInt();
		int[] num = new int[size];
		for (int index = 0; index < num.length; index++) {
			System.out.println("Enter number : ");
			num[index] = scanner.nextInt();

		}
		{
			freqNo.getFreqNum(num);
		}
	}
}
