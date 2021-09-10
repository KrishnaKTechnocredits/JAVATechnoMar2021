package amrutaM.Assignment31;
/*program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number*/

public class P1_PerfectNumber {
	void isNumberPerfect(int number) {
		int sum = 1;
		for (int index = 2; index <=number/2; index++) {
			if (number % index == 0) {
				sum = sum + index;
			}
		}
		System.out.println(sum);
		if (number != sum) {
			System.out.println("Number is a not perfect number");
		} else {
			System.out.println("Number is  a perfect number");
		}
	}

	public static void main(String[] args) {
		new P1_PerfectNumber().isNumberPerfect(6);//1 +2+ 3 =6
	}
}
