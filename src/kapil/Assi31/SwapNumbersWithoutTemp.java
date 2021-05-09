//WAP1 swap 2 numbers using temporary variable.
//input x = 10 , y = 20
//output x = 20 y = 10		  


package kapil.Assi31;

public class SwapNumbersWithoutTemp {
	
	void getSwapNum(int x,int y) {
		int temp =x;
		x=y;
		y =temp;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
	
	
	public static void main(String[] args) {
		SwapNumbersWithoutTemp swapnum= new SwapNumbersWithoutTemp();
		swapnum.getSwapNum(10,20);
	}

}
