package amruta.Assignment_29_to_32;

public class SwapNumberWithoutUsingTempVariable {

	void swapNumber(int x, int y) {
		
		y = x+y;
		
		x = y-x;
		
		y = y-x;
		
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}

	public static void main(String[] args) {
		SwapNumberWithoutUsingTempVariable swap = new SwapNumberWithoutUsingTempVariable();
		swap.swapNumber(20, 30);
	}
}
