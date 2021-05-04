package trupti.Swap;

public class SwapWithTemp {
	void getSwapNum() {
		int x=10;
		int y=20;
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("Value of x after swapping is "+x+".");
		System.out.println("Value of y after swapping is "+y+".");
	}

	public static void main(String[] args) {
		SwapWithTemp swapwithtemp=new SwapWithTemp();
		swapwithtemp.getSwapNum();

	}

}
