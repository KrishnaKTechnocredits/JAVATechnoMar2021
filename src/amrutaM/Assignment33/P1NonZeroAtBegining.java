package amrutaM.Assignment33;

import java.util.Arrays;

/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/
public class P1NonZeroAtBegining {

	void shiftAllNonZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				count++;
			}
		}

		for (int iIndex = 0; iIndex < input.length; iIndex++) {
			if (input[iIndex] > 0) {
				output[count] = input[iIndex];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		new P1NonZeroAtEnd().shiftAllNonZeroAtEnd(input);
	}

}
