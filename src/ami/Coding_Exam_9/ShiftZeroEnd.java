/*
 Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/

package ami.Coding_Exam_9;

public class ShiftZeroEnd {

	int[] uniqNum() {
		int[] input = { 1,3,0,3,0,6,0,9,23,45 };
		int[] temp = new int[input.length];
		int count = 0;
		for (int i = 0; i < input.length; i++) {
				if (input[i] != 0) {
					temp[count] = input[i];
					count++;
				}
			}
		return temp;
		}
		
	

	public static void main(String[] a) {
		ShiftZeroEnd r1 = new ShiftZeroEnd();
		int[] output = r1.uniqNum();
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}
}
