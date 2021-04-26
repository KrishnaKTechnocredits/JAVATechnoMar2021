package madhavi_Raut.CodingExam.Exam_02;
/*Program 1 : 
WAP to do sum of all the integer from the given string
Input: String str = "12h14i4w8sdc15"
Output: 12+14+4+8+15 = 53*/

public class FindSumOfIntegersInString {

	int getSumOfIntegersInString(String str) {
		int sumOfIntegers = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = true;
			if (Character.isDigit(ch)) {
				String str2 = String.valueOf(ch);
				for (int innerIndex = index + 1; innerIndex < str.length(); innerIndex++) {
					if (Character.isDigit(str.charAt(innerIndex))) {
						str2 += String.valueOf(str.charAt(innerIndex));
						if (innerIndex == str.length() - 1) {
							index = innerIndex;
						}
					} else {
						if (innerIndex < str.length() - 1) {
							index = innerIndex;
							flag = false;
						}
					}
					if (flag == false)
						break;
				}
				sumOfIntegers += Integer.parseInt(str2);
			}
		}
		return sumOfIntegers;
	}

	public static void main(String[] args) {
		System.out.println("Below is the sum of integers present in given string:");
		System.out.println(new FindSumOfIntegersInString().getSumOfIntegersInString("12h14i4w8sdc15"));
	}
}
