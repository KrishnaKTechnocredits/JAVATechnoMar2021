package kangan.assignments.assignment_20;

public class Sum {

	void getSum(String str) {
		int digitSum = 0;
	
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
			digitSum = digitSum + Character.getNumericValue(ch);
			
		}
		System.out.println(digitSum);
	}
	public static void main(String[] args) {
		Sum sum = new Sum();
		sum.getSum("J7yu9y8h1h8j4b7j3jjb6");
		
	}
}
