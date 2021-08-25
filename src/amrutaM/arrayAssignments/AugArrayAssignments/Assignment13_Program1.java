package amrutaM.arrayAssignments.AugArrayAssignments;

/*program 1 : return count of positive numbers from given array. 
int[] input = {1,-11,-44,23,55,-99,-23,-22}; 
output : 3 
*/
public class Assignment13_Program1 {

	int getPositiveNumbersCount(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		Assignment13_Program1 assignment13_Program1 = new Assignment13_Program1();
		int count = assignment13_Program1.getPositiveNumbersCount(input);
		System.out.println(count);
	}

}
