package pallavi.coding_exam_2;

/*Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"*/
public class SumOfDigit {
	static int sum = 0;

	int sumOfInterger(String str) {

		int sum = 0;
		char num1 = 0, num2 = 0;
		String a;

		for (int index = 0; index < str.length(); index++) {
			num1 = str.charAt(index);
			if (Character.isDigit(num1)) {
				char b = num1;
				int innerIndex = index + 1;
				index = innerIndex;
				num2 = str.charAt(innerIndex);
				if (Character.isDigit(num2)) {
					a = Character.toString(num1) + Character.toString(num2);
					sum = sum + Integer.parseInt(a);
				}

				else {
					sum = sum + Character.getNumericValue(b);
				}

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "12h14i4w8sdc15";
		int sum = new SumOfDigit().sumOfInterger(input);
		System.out.println("Output :" + sum);
	}

}
