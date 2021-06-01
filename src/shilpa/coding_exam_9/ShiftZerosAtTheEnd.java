/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/
package shilpa.coding_exam_9;

public class ShiftZerosAtTheEnd {
	int[] getArrByShiftingZeros(int[] inputArr) {
		int[] outPutArr = new int[inputArr.length];
		int index2 = 0;
		for (int index1 = 0; index1 < inputArr.length; index1++) {
			if (inputArr[index1] != 0) {
				outPutArr[index2] = inputArr[index1];
				index2++;
			}
		}
		return outPutArr;
	}

	public static void main(String[] args) {
		ShiftZerosAtTheEnd shiftZerosAtTheEnd = new ShiftZerosAtTheEnd();
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = shiftZerosAtTheEnd.getArrByShiftingZeros(input);
		System.out.println("Updated Array is ");
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}

}
