package krishna_CodingTest_9;

public class ShiftAllZero {

	int[] shiftZero(int input[]) {
		int[] output = new int[input.length];
		int count = 0;
		
		for(int index=0;index<input.length;index++ ) {
			boolean zero=false;
			if(input[index]==0) {
				zero=true;
			}if(!zero) {
				output[count]= input[index];
				count++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		ShiftAllZero shiftAllZero = new ShiftAllZero();
		int[] input = {1,3,0,3,0,6,0,9,23,45};
		int[] output = shiftAllZero.shiftZero(input);
		System.out.print("Output in arranged form is :");
		for(int index=0;index<output.length;index++) {
			System.out.print(output[index]+" ");
		}
	}
}
