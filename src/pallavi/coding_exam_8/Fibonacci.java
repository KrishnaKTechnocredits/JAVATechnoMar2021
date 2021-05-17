package pallavi.coding_exam_8;

/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 */
public class Fibonacci {
	
	void fibonacci() {
		int num1=0, num2=1;
		int num3=num1+num2;
		System.out.print(num1 +" " +num2+ " " +num3);
		for(int index=1;index<=5;index++) {
			num1=num2;
			num2=num3;
			num3=num1+num2;
			System.out.print(" "+num3+"");
		}
	}

	public static void main(String[] args) {
		new Fibonacci().fibonacci();

	}

}
