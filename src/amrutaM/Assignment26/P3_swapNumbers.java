package amrutaM.Assignment26;

/*Program : 3  swap 2 numbers with using 3rd variable */
public class P3_swapNumbers {

	void swapNumbers(int num1, int num2) {
		System.out.println("Numbers before swapping --> "+ num1 +" : "+num2);
		int temp =0;
		temp = num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swapping --> "+num1+" : "+num2);
	}
	public static void main(String[] args) {
		new P3_swapNumbers().swapNumbers(10, 11);
	}
}
