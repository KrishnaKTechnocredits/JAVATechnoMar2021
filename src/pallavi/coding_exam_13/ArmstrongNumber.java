package pallavi.coding_exam_13;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]*/
import java.util.ArrayList;

public class ArmstrongNumber {

	public ArrayList<Integer> getArmStrongNumber(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int temp1 : number) {
			int num = temp1;
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}

				if (temp1 == sum)
					output.add(temp1);
			
		}

		return output;
	}

	public static void main(String[] args) {
		int[] input = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> arr = new ArmstrongNumber().getArmStrongNumber(input);
		System.out.println(arr);

	}

}
