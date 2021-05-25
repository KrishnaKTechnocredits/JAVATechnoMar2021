package pavan.PavanB_Coding_Test_8;

public class Test8Example2 {
	static int n1 = 0;
	static int n2 = 1;
	int n3 = 0;
	int temp = 0;

	void getFebos() {
		int input = 6;
		while (input > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
			input--;

		}

	}

	public static void main(String[] args) {
		System.out.println(n1);
		System.out.println(n2);
		Test8Example2 t = new Test8Example2();
		t.getFebos();

	}
}
