package sai.codingExam2;

public class SumOfInt {

	public static void main(String[] args) {

		SumOfInt SumOfInt = new SumOfInt();
		SumOfInt.getSum("12h14i4w8sdc15");

	}

	void getSum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				if (index < (name.length() - 1) && Character.isDigit(name.charAt(index + 1))) {
					sum = sum + Character.getNumericValue(name.charAt(index)) * 10
							+ Character.getNumericValue(name.charAt(index + 1));
					index = index + 1;
				} else {
					sum = sum + Character.getNumericValue(name.charAt(index));
				}
			}
		}
		System.out.println(sum);
	}

}
