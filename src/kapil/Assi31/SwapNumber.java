//WAP2 swap 2 numbers without using temporary variable.
 //input x = 10 , y = 20
 //output x = 20 y = 10		  

package kapil.Assi31;

public class SwapNumber {
	
	
	void getSwapNo(int x,int y) {
		x= x+y;
		y=x-y;
		x=x-y;
		System.out.println("X ="+x+"Y ="+y);
	}
	
	public static void main(String[] args) {
		SwapNumber swapnumber = new SwapNumber();
		swapnumber.getSwapNo(10,20);
	}

}
