package meenu.coding_exam9;

import java.util.Arrays;

/*Shift all zero's at the end
 input:{1,3,0,3,0,6,0,9,23,45}
 output:{1,3,3,6,9,23,45,0,0,0}
 */

public class ShiftingNum {
	
	int[] getNumbers(int[] array) {
		int[] outputArr = new int[array.length];
		int count = 0;
		for(int index = 0; index< array.length;index++) {
			if(array[index]!=0) {
				outputArr[count++]= array[index];
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,0,3,0,6,0,9,23,45};
		ShiftingNum shiftingNum = new ShiftingNum();
		System.out.println(Arrays.toString(shiftingNum.getNumbers(arr)));
	}
}
