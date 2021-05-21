package kapil.Exam2;

public class IntergerSum {

	void getIntSum(String str) {
		int sum = 0;
 
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {

				sum = sum + Character.getNumericValue(str.charAt(index));
		}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		IntergerSum intergersum = new IntergerSum();
		intergersum.getIntSum("12h14i4w8sdc15");
	}
}
