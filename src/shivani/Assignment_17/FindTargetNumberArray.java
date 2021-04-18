package shivani.Assignment_17;

import java.util.Scanner;

/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.*/

public class FindTargetNumberArray {

	boolean fTargetNumber(int tNum) {
		
		int[] numList = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };

		for (int index = 0; index < numList.length; index++) {

			if (numList[index] == tNum) {

				
				System.out.println("targeted number" +tNum+" is in the list");
				return true;
			}
			
		
		
		}
		System.out.println(" taregeted number does not find in the list");
		return false;

	}

	public static void main(String[] args) {
		FindTargetNumberArray findTarNum = new FindTargetNumberArray();
		System.out.println(" which number you want to find in list");
		Scanner fnumber = new Scanner(System.in);
		int num = fnumber.nextInt();
		findTarNum.fTargetNumber(num);

	}

}
