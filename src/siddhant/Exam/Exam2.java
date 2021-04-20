package siddhant.Exam;

public class Exam2{

	void findMaxMin(int[] array) {
		int minage = array[0];
		int maxage = array[0];
		for (int index = 0; index < array.length; index++) {
			for (int j = 1; j < array.length; j++) {
				if (minage > array[j])
					minage = array[j];
				if (maxage < array[j])
					maxage = array[j];
			}
		}
		difference(maxage,minage);
	}

	void difference(int maxage, int minage) {
		int difference = maxage - minage;
		System.out.println("Difference is " + difference);
	}

	public static void main(String[] args) {

		Exam2 exam2_Prog2 = new Exam2();
		int[] array = { 7, 12, 56, 62, 25 };
		exam2_Prog2.findMaxMin(array);
	}
}