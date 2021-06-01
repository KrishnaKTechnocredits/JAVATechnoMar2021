package mayur.coding_exam_9;

public class Array {

	int [] arrangeArr(int[] input) {
		int[] output = new int[input.length];
		int countIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if(input[index]!=0) {
				output[countIndex] =input[index];
				countIndex++;
			} 
		}
		return output;
	}

	public static void main(String[] args) {
		Array arr = new Array();
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = arr.arrangeArr(input);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}

}
