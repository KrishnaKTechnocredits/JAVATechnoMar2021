package krishna.CodingTest_13;
import java.util.ArrayList;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]*/

public class CheckArmstrong {

	public ArrayList<Integer> getArmStrongNumber(int[] number) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int temp : number) {
			int num = temp;
			int cube = 0;
			while (num > 0) {
				int mod = num % 10;
				num = num / 10;
				cube = cube + (mod * mod * mod);
			}
			if (cube == temp)
				output.add(temp);

		}

		return output;
	}

	public static void main(String[] a) {
		CheckArmstrong checkArmstrong = new CheckArmstrong();
		int[] array = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> output = checkArmstrong.getArmStrongNumber(array);
		System.out.println("All the armstrong number from given array : "+output);
	}

}
