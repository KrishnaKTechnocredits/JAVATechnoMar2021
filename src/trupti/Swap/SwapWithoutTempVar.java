package trupti.Swap;

public class SwapWithoutTempVar {
	
	void getSwapNumWithoutTemp() {
		int x=10;
		int y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of x after swapping is "+x+".");
		System.out.println("Value of y after swapping is "+y+".");
	}

	public static void main(String[] args) {
		SwapWithoutTempVar swapwithouttempvar=new SwapWithoutTempVar();
		swapwithouttempvar.getSwapNumWithoutTemp();
	}

}
