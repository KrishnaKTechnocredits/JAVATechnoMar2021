//Wap Fibonacci series upto 8
package kapil.CodingTest8;

public class Fibonacci {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int temp;

		for (int index = 0; index < 6; index++) {
			System.out.println(+x);
			System.out.println(+y);
			temp = x + y;
			x = y;
			y = temp;
			System.out.println(+temp);
		}
	}
}
