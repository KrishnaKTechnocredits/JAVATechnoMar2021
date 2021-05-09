package purva.PurvaS_coding_exam_2;

public class SumOfNumbersInString {
	
	 int sumOfIntInString(String input) {
		 int sum = 0;
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				boolean flag = true;
				if (Character.isDigit(ch)) {
					String temp = String.valueOf(ch);
					for (int innerIndex = index + 1; innerIndex < input.length(); innerIndex++) {
						if (Character.isDigit(input.charAt(innerIndex))) {
							temp = temp + String.valueOf(input.charAt(innerIndex));
							if (innerIndex == input.length() - 1) {
								index = innerIndex;
							}
						} else {
							if (innerIndex < input.length() - 1) {
								index = innerIndex;
								flag = false;
							}
						}
						if (flag == false)
							break;
					}
					sum = sum + Integer.parseInt(temp);
				}
			}
			return sum;
		}

		public static void main(String[] args) {
			System.out.println(new SumOfNumbersInString().sumOfIntInString("12h14i4w8sdc15"));
		}
	}