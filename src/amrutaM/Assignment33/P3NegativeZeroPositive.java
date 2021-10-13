package amrutaM.Assignment33;

import java.util.Arrays;

/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/
public class P3NegativeZeroPositive {

	void getNegativeZeroPositiveNumbers(int[] input) {
		int zeroCnt = 0;
		int count = 0;
		int[] output = new int[input.length];
		
		for (int index = 0; index < input.length; index++) {
			if(input[index]==0) {
				zeroCnt++;
			}else if (input[index] < 0) {
				output[count] = input[index];
				count++;//3
			} 
		}
			int outI = count+zeroCnt;
			System.out.println("outI --> "+outI);
			
			for (int outindex =0 ; outindex < input.length; outindex++) {
				if (input[outindex] > 0) {
					output[outI] = input[outindex];
					outI++;
				}
				
			}
			System.out.println(Arrays.toString(output));
		}
	

	public static void main(String[] args) {
		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		new P3NegativeZeroPositive().getNegativeZeroPositiveNumbers(input);
	}
}
