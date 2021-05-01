package shashank_coding_exam_2;

public class SumOfNumbersInString {
	public int sumOfNumbers(String str) {
		int sum = 0, temp = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp = index;
				while (index < str.length() - 1 && Character.isDigit(str.charAt(index + 1))) {
					index++;
				}
				String str2 = str.substring(temp, index + 1);
				sum += Integer.valueOf(str2);

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String str = "12h14i4w8sdc15";
		int sum = sumOfNumbersInString.sumOfNumbers(str);
		System.out.println("Sum of all integer in given string " + str + " is " + sum);
	}

}
