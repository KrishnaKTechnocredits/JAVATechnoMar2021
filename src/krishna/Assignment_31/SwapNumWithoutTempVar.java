package krishna.Assignment_31;

public class SwapNumWithoutTempVar {
	void swapNumWithoutVar() {
		int x = 10;
		int y = 20;
		System.out.println("Before swaping value of x= " + x + " and y= " + y);
		x = x + y;// 10+20=30
		y = x - y;// 30-20=10
		x = x - y;// 30-10=20
		System.out.println("After swaping value of x= " + x + " and y= " + y);

	}

	public static void main(String[] args) {
		SwapNumWithoutTempVar swapNumWithoutTempVar = new SwapNumWithoutTempVar();
		swapNumWithoutTempVar.swapNumWithoutVar();
	}

}
