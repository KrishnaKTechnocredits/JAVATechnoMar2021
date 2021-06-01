/*Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/

package rahul_Hiremath.assignment_30;

public class Ass_30_1 {

	int secondMax(int[] num) {
		int max = num[0];
		int secondMax = 0;
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				secondMax = max;
				max = num[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {

		Ass_30_1 ass_30_1 = new Ass_30_1();
		int[] num = { 10, 33, 43, 55, 97, 11, 3 };
		int secondMax = ass_30_1.secondMax(num);
		System.out.println("Second max is: " + secondMax);
	}
}
