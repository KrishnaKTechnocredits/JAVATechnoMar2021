/*
 Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
 */

package pavan.Assignment17;

public class CountNegAndPosNumbres {
	int negcount = 0;
	int poscount = 0;

	void getNumbers(int[] args) {

		for (int index = 0; index < 7; index++) {
			if (args[index] < 0) {
				negcount = negcount + 1;
			}
			if (args[index] > 0) {
				poscount = poscount + 1;
			}
		}
		System.out.println("negative number count is " + negcount);
		System.out.println("Positive number count is " + poscount);
	}
	public static void main(String[] args) {
		int[] num = { 10, 23, 26, -27, -88, 87, -65 };
		CountNegAndPosNumbres countNegAndPosNumbres = new CountNegAndPosNumbres();
		countNegAndPosNumbres.getNumbers(num);
	}

}
