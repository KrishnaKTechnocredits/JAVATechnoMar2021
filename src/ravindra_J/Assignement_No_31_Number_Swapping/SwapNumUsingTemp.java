/*Assignment - 31 : 4th May'2021
 * 
program 1: swap 2 numbers using a temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package ravindra_J.Assignement_No_31_Number_Swapping;
import java.util.Scanner;
public class SwapNumUsingTemp {

	public void swapNum() {
		int x = 0, y = 0, temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for x");
		x = scanner.nextInt();
		
		System.out.println("Enter number for y");
		y = scanner.nextInt();
		scanner.close();
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("Numbers after swapping : -> x=" + x + " y=" + y);
	}

	public static void main(String[] args) {
		SwapNumUsingTemp snut = new SwapNumUsingTemp();
		snut.swapNum();
	}

}
