package renuka.exam13;

/*return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]*/
//public ArrayList<Integer> getArmStrongNumber(int numbser[]){

import java.util.ArrayList;

public class ArmStrongNumberFromArray {
	
	public static void main(String[] args) {
		int[] arr = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++)
			numList.add(arr[index]);
		System.out.println("Input list is : " + numList);
		ArmStrongNumberFromArray armstrongArrayList = new ArmStrongNumberFromArray();
		System.out
				.println("ArmStrong Numbers in the list are : " + armstrongArrayList.getArmStrongNum(numList));
	}

	public ArrayList<Integer> getArmStrongNum(ArrayList<Integer> numList) {
		int numTemp = 0;
		int newNum = 0;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int num : numList) { // 153
			numTemp = num;
			int sum = 0;
			while (numTemp > 0) {
				newNum = numTemp % 10; // 3//5//1
				sum += newNum * newNum * newNum; // 9//125/1
				numTemp = numTemp / 10; // 15//1//0
			}
			if (sum == num)
				output.add(num);
		}
		return output;
	}

}

	
