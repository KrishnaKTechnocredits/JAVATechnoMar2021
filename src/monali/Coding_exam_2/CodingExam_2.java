package monali.Coding_exam_2;

public class CodingExam_2 {
	
	int getSum(String name) {
		char ch;
		String num = "";
		int sum = 0;

		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				num = num + ch;
			} else if (Character.isLetter(ch)) {
				if (!num.equals(""))
					sum = sum + Integer.parseInt(num);
				num = "";

			}

		}
		if (!num.equals(""))
			sum = sum + Integer.parseInt(num);
		System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {
		CodingExam_2 coding = new CodingExam_2();
		coding.getSum( "12h14i4w8sdc15");
	}

}
