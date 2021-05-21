/*Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

package rahul_Hiremath.assignment_17;

public class Ass_17_7 {

	int checkMinNum(int[] array) {
		int min = array[0];
		for (int index = 1; index < array.length; index++) {
			if (min > array[index])
				min = array[index];
		}
		return min;
	}

	public static void main(String[] args) {

		Ass_17_7 ass_17_7 = new Ass_17_7();
		int[] array = { 22, 35, 65, 88, 11, 23, 45 };
		int min = ass_17_7.checkMinNum(array);
		System.out.println("Minimum number is: " + min);
	}
}
