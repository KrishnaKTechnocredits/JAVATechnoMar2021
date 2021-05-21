package monali.Assignment_30;

public class FindSecondMaxNum {

	void getSecondMaxNum(int[] num) {
		int maxnum = num[0];
		int secondmax = num[0];
		for (int index = 1; index < num.length; index++) {
			if (num[index] > maxnum) {
				secondmax = maxnum;
				maxnum = num[index];

			} else if (num[index] > secondmax) {
				secondmax = num[index];
			}
		}
		System.out.println("second max num is " + secondmax);

	}

	public static void main(String[] args) {
		FindSecondMaxNum secondmax = new FindSecondMaxNum();
		int[] num = { 89, 47, 99, 102, 100 };
		secondmax.getSecondMaxNum(num);
	}

}
