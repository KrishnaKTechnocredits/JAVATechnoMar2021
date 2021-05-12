package sangeeta.CodingExam;

public class CodingExam4 {

	String getPalindrom(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(str);
		sb2 = sb1.reverse();
		String str1 = sb2.toString();
		if (str.equalsIgnoreCase(str1))
			return str;
		else
			return "";
	}

	String[] splitString(String str) {
		String[] strarr = str.split(" ");
		String[] output = new String[strarr.length];
		for (int index = 0; index < strarr.length; index++) {
			output[index] = getPalindrom(strarr[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam4 codingExam4 = new CodingExam4();
		String str = "Hi MAM hello NamaN techno";
		String[] output = codingExam4.splitString(str);
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}
}
