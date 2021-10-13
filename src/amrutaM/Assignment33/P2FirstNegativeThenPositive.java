package amrutaM.Assignment33;

import java.util.Arrays;

/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
public class P2FirstNegativeThenPositive {

	void getNegativeThenPositive(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {

			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
		}
		for (int outIndex = 0; outIndex < input.length; outIndex++) {
			if (input[outIndex] > 0) {
				output[count] = input[outIndex];
				count++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {

		int[] input = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		new P2FirstNegativeThenPositive().getNegativeThenPositive(input);
	}
}
