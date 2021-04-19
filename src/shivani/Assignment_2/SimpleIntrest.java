package shivani.Assignment_2;

class SimpleIntrest {

	void intrest(int p, int t, double r) {
		double simpleIntrest = (p * r * t) / 100;
		System.out.println("Simple interest is =" + simpleIntrest);
	}

	public static void main(String[] args) {
		SimpleIntrest simpleIntrest = new SimpleIntrest();
		simpleIntrest.intrest(100, 10, 2.5);
	}
}
