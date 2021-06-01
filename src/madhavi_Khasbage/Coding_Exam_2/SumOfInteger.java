package madhavi_Khasbage.Coding_Exam_2;

/**
 * Coding Exam - 2 : 26th April 2021 Program 1 : WAP to do sum of all the
 * integer from the given string Input: String str = "12h14i4w8sdc15" Output:
 * 12+14+4+8+15 = 53
 */
public class SumOfInteger {

	int getSumOfInteger(String strInput) {
		int calSum = 0, num = 0;
		String strData = "";
		for (int index = 0; index < strInput.length(); index++) {
			char ch = strInput.charAt(index);
			if (Character.isDigit(ch)) {
				strData += ch;
			} else {
				if (strData != "") {
					num = Integer.parseInt(strData);
				}
				calSum += num;
				num = 0;
				strData = "";
			}
			if ((index + 1 == strInput.length()) && strData != "") {
				num = Integer.parseInt(strData);
				calSum += num;
			}
		}
		return calSum;
	}

	public static void main(String[] args) {
		SumOfInteger objSum = new SumOfInteger();
		System.out.println(objSum.getSumOfInteger("12h14i4w8sdc15ww"));
	}
}
