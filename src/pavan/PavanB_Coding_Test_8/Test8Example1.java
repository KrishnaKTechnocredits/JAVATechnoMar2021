//Febo Series

package pavan.PavanB_Coding_Test_8;

public class Test8Example1 {
	void getUniq() {

		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int num = 0;
		int j = 0;
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}
			if (i == j)
				output[i] = arr[i];
		}

		for (int i = 0; i < output.length; i++) {
			if (output[i] != 0)
				System.out.println(output[i]);
		}

	}

	public static void main(String[] args) {
		Test8Example1 t = new Test8Example1();
		t.getUniq();
	}

}
