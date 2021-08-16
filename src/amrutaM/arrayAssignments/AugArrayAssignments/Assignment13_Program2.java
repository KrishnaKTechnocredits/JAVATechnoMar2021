package arrayAssignmentsAugust;

/* program 2 : count number of zero's in given array.
 * int[] input = {1,-11,0,0,55,0,-23,0};  
 * output : 4 
*/
public class Assignment13_Program2 {

	int getZerosCount(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};  
		Assignment13_Program2 assignment13_Program2 = new Assignment13_Program2();
		int count = assignment13_Program2.getZerosCount(input);
		System.out.println("Total number of zero's in the given array is - "+count);
	}

}
