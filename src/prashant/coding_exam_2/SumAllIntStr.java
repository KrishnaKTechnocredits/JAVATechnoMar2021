//WAP to do sum of all the integer from the given string
//
//Input: String str = "12h14i4w8sdc15"
//
//Output: 12+14+4+8+15 = 53
package prashant.coding_exam_2;

public class SumAllIntStr {
	public int getNumsum(String str) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// System.out.println(ch);
			// String temp = "0";
			if (Character.isDigit(ch)) {
				if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
					temp += ch;
				} else {
					temp += ch;
					sum += Integer.parseInt(temp);
					temp = "0";
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumAllIntStr str = new SumAllIntStr();
		String strInput = "12h14i4w8sdc15";
		int output = str.getNumsum(strInput);
		System.out.println("sum of all the integer from the given string " +strInput+ " is " + output);
	}
}
