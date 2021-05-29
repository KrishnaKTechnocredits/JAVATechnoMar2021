package pavan.PavanB_coding_test_13;

public class GetArmStrongNum {
	int isNumarmNum(int input) {
		int c = 0, a, temp;
		int n = input;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println(temp);

		return temp;
	}

	void getarmnum() {

		int[] arr = { 153, 279, 371, 303, 407 };

		for (int num : arr) {

			isNumarmNum(num);
		}

	}

	public static void main(String[] args) {

		GetArmStrongNum get = new GetArmStrongNum();
		get.getarmnum();

	}
}
