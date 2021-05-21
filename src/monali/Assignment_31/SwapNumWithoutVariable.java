package monali.Assignment_31;

public class SwapNumWithoutVariable {

	void swapNum() {
		int x = 34;
		int y = 50;

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x :" + x);
		System.out.println("y :" + y);
	}

	public static void main(String[] args) {
		SwapNumWithoutVariable num = new SwapNumWithoutVariable();
		num.swapNum();
	}

}
