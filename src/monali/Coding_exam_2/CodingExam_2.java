package monali.Coding_exam_2;

public class CodingExam_2 {
	
	 int getSum(String name) {
		 char ch;
			int num;
			int sum = 0;

			for (int index = 0; index < name.length(); index++) {
				ch = name.charAt(index);
				if (Character.isDigit(ch)) {
					num = Character.getNumericValue(ch);
					sum += num;
				}
			}
		System.out.println(sum);

		return sum;
	}
	
	public static void main(String[] args) {
		CodingExam_2 coding = new CodingExam_2();
		coding.getSum("mon1a34l6i8");
	}

}
