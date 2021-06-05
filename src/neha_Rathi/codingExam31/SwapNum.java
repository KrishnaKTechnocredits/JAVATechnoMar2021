/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package neha_Rathi.codingExam31;

public class SwapNum {
	
	static void swap(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("x: "+num1+" y: "+num2);
	}
	static void swapWithTemp(int num1,int num2) {
		int temp= num1;
		num1=num2;
		num2=temp;
		System.out.println("x: "+num1+" y: "+num2);
	}

	public static void main(String[] args) {
		swap(10,20);
		swapWithTemp(10,20);
	}
}
