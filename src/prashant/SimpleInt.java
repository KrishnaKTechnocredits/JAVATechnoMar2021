//Java program to compute simple interest

package prashant;

public class SimpleInt {

	void simpleint(int P, double T, double R) {
		double si = (P * T * R) / 100;
		System.out.println("Simple intrest of given Principal =12000, Time= 1 Yr. ,Rate=6.5  is :" + si);
	}

	public static void main(String[] args) {
		SimpleInt si = new SimpleInt();
		si.simpleint(12000, 1, 6.5);
	}

}
