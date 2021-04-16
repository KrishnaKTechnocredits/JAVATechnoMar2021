/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

package rahul_Hiremath.assignment_17;

public class Ass_17_6 {

	int maxNum(int[] array) {
		int max = array[0];
		for (int index = 1; index < array.length; index++) {
			if (max < array[index])
				max = array[index];
		}
		return max;
	}

	public static void main(String[] args) {
		Ass_17_6 ass_17_6 = new Ass_17_6();
		int[] array = { 22, 35, 65, 88, 11, 23, 45 };
		int max = ass_17_6.maxNum(array);
		System.out.println("Max number is: " + max);
	}
}
