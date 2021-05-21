package pavan.PavanB_coding_exam_9;

public class ArrangeOpArray {

	void getRevArray() {
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };

		int[] Narry = new int[arr.length];
		int count = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				Narry[count] = arr[index];
				count++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			System.out.println(Narry[index]);
		}
	}
	public static void main(String[] args) {
		ArrangeOpArray a = new ArrangeOpArray();
		a.getRevArray();

	}
}