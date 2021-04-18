package shashank_assignment_19_22;

public class SumOfDigitOfString {

	private  void sumOfDigit(String str) {
		int sum=0;
		for (int index=0;index<str.length();index++) {
			if (Character.isDigit(str.charAt(index)))
				sum+=str.charAt(index)-48;
		}
		System.out.println("Sum of Digits of String is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitOfString sumOfDigitOfString = new SumOfDigitOfString();
		String str="J7yu9y8h1h8j4b7j3jjb6";
		sumOfDigitOfString.sumOfDigit(str);
				
	}

}
