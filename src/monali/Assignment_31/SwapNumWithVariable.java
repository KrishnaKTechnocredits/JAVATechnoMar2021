package monali.Assignment_31;

public class SwapNumWithVariable {

	void swapNum() {
		int x = 15;
		int y = 20;
		int z;
		z = x;
		x = y;
		y = z;
		System.out.println("x :" + x);
		System.out.println("y :" + y);
	}

	public static void main(String[] args) {
		SwapNumWithVariable num = new SwapNumWithVariable();
		num.swapNum();
	}
}
