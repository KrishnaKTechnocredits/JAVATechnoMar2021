package rahul_Hiremath.Ass_10;

public class Ass_10 {

	double add(int num1, int num2) {
		double ans = num1 + num2;
		return ans;
	}

	double substration(int num1, int num2) {
		double ans = 0;
		if (num1 >= num2)
			ans = num1 - num2;
		return ans;
	}

	double division(int num1, int num2) {
		double ans = num1 % num2;
		System.out.println(ans);
		return ans;
	}

	double multiplication(int num1, int num2) {
		double ans = num1 * num2;
		System.out.println(ans);
		return ans;
	}

	void printTotalAnswer(double add, double sub, double multi, double div) {
		double total = add + sub + multi + div;
		System.out.println("Total is: " + total);
	}

	public static void main(String[] args) {

		Ass_10 ass_10 = new Ass_10();
		double addAns = ass_10.add(10, 20);
		double subAns = ass_10.substration(20, 12);
		double multAns = ass_10.multiplication(5, 2);
		double divAns = ass_10.division(50, 10);
		ass_10.printTotalAnswer(addAns, subAns, multAns, divAns);
	}
}
