package mayur.coding_exam2;

public class StringInputNumberSum {
	int getStringInputNumberSum(String str) {

		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				if (index < str.length() && Character.isDigit(str.charAt(index+1))) {
					sum += Character.getNumericValue(str.charAt(index)) * 10
							+ Character.getNumericValue(str.charAt(index + 1));
					index += 1;
				} else
					sum += Character.getNumericValue(str.charAt(index));
		}

		return sum;
	}

	public static void main(String[] args) {
		StringInputNumberSum string = new StringInputNumberSum();
		int output = string.getStringInputNumberSum("12h14i4w8sdc15");
		System.out.println("Sum of digits in String is :" + output);

	}
}
