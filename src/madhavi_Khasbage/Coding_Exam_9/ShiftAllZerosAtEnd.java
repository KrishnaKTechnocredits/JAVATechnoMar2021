package madhavi_Khasbage.Coding_Exam_9;

import java.util.Arrays;

/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

public class ShiftAllZerosAtEnd {

	int[] shiftallzeros(int[] my_arr) {
		int[] arry = new int[my_arr.length];
		int cnt=0;
		for (int index = 0; index < my_arr.length; index++) {
			if (my_arr[index] > 0) {
				arry[cnt] = my_arr[index];
				cnt++;
			}
		}	
		return arry;
	}

	public static void main(String[] args) {

		ShiftAllZerosAtEnd shiftAllZerosAtEnd1 = new ShiftAllZerosAtEnd();
		int[] my_arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };		
		 int[] output_arry= shiftAllZerosAtEnd1.shiftallzeros(my_arr);		
		System.out.println( Arrays.toString(output_arry));
	}

}
