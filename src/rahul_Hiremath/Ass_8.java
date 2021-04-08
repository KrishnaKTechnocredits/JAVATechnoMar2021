package rahul_Hiremath;

public class Ass_8 {

	void evenNo(int start, int end) {
		System.out.println("Even numbers are: ");
		while (start <= end) {
			if (start % 2 == 0)
				System.out.println(start);
			start++;
		}
		System.out.println("*****************************");
	}

	void div5(int start, int end, int num) {
		System.out.println("Divisible by 5, numbers are: ");
		while (start <= end) {
			if (start % num == 0) {
				System.out.println(start);
			}
			start++;
		}
		System.out.println("*****************************");
	}

	void div_3_5(int start, int end, int div1, int div2) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		while (start <= end) {
			if (start % div1 == 0 && start % div2 == 0) {
				System.out.println(start);
			}
			start++;
		}
		System.out.println("*****************************");
	}

	void div_7_13(int start, int end, int num1, int num2) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		while (start <= end) {
			if (start % num1 == 0)
				System.out.println(start + " is divisible by " + num1);
			else if (start % num2 == 0)
				System.out.println(start + " is divisible by " + num2);
			start++;
		}
		System.out.println("*****************************");
	}

	public static void main(String[] args) {
		Ass_8 ass_8 = new Ass_8();
		ass_8.evenNo(10, 15);
		ass_8.div5(10, 30, 5);
		ass_8.div_3_5(5, 18, 3, 5);
		ass_8.div_7_13(5, 40, 7, 13);
	}
}
