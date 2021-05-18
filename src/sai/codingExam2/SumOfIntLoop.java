package sai.codingExam2;

public class SumOfIntLoop {

	public static void main(String[] args) {
		SumOfIntLoop SumOfIntLoop = new SumOfIntLoop();
		SumOfIntLoop.getTheSum("12h14i4w8sdc15");
	}

	

	void getTheSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			String tempStr = "";
			if (Character.isDigit(ch)) {
				tempStr = Character.toString(ch);
				for (int innerIndex = index + 1; innerIndex < str.length(); innerIndex++) {
					ch = str.charAt(innerIndex);
					if (Character.isDigit(ch)) {
						tempStr = tempStr + ch;
					}
					sum = sum + Integer.parseInt(tempStr);
					index++;
					break;
				}

			}

		}
		System.out.println("Total integer sum is: " + sum);
	}

}
