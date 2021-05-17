package ami.Coding_Exam_6;

public class MaxCharReturn {
	
	char getMaxChar(String arr) {
		arr = arr.toLowerCase();
		char ch = ' ';
		char[] input = arr.toCharArray();
		int max = 0, count = 0;
		for (int index1 = 0; index1 < input.length; index1++) {
			for (int index2 = 0; index2 < arr.length(); index2++) {
				if (arr.charAt(index2) == input[index1] && ch != input[index1]) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				count = 0;
				ch = input[index1];
			}

		}
		return ch;
	}

	public static void main(String[] args) {
		MaxCharReturn maxCharReturn = new MaxCharReturn();
		String arr = "globant India is hiring";
		char ch = maxCharReturn.getMaxChar(arr);
		System.out.println("Max Char Return : "+ch);
	}
}
