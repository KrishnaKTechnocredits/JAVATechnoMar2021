//if no exist in your array return true, else return no not present
package kajal.ScannerExamples;

import java.util.Scanner;

public class Assignment17p5 {

		boolean isNumberPresent(int[] input, int findNum) {
			boolean isNumPresent = false;
			for(int index=0; index<input.length; index++) {
				if(input[index] == findNum)
					isNumPresent = true;
				}
			return isNumPresent;
		}	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter target number");
			int Number = scanner.nextInt();
			int[] input = {10,23,23,44,23,10,23,4,23};
			
			if(new Assignment17p5().isNumberPresent(input, Number))
				System.out.println("Number "+Number +" found in given array.");
			else
				System.out.println("Number "+Number +" does not found in given array.");
		}

		}