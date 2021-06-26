package ankit.coding_exam_22;

public class TestSum {
	
	private static int getSumOfNumberOtherThanBetween6And9(int[] input) {
		int sum = 0;
		for(int index = 0; index < input.length ; index++) {
			if(input[index] != 6) {
				sum = sum+ input[index];
			}
			else {
				while(input[index] != 9) {
					index= index+1 ;
				}
			}
		}
		return sum;	
	}		

	public static void main(String[] args) {
		int[] input = {2,1,6,9,11,6,19,12,9,2};
		System.out.println("Sum "+getSumOfNumberOtherThanBetween6And9(input));
	}
}