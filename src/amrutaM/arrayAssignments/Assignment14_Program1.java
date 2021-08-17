package amrutaM.arrayAssignments;

/*program 1 : find maximum number from given array. 
int[] input = {1,11,44,23,55,99,23}; 
output : 99 */
public class Assignment14_Program1 {
	void getMaxNumber(int[] input) {
		int maxNum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxNum) {
				maxNum = input[index];
			}
		}
		System.out.println("Maximum number from the given array is -> "+maxNum);
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		Assignment14_Program1 assignment14_Program1 = new Assignment14_Program1();
		assignment14_Program1.getMaxNumber(input);
	}
}
