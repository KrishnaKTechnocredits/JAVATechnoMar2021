package purva.Assignment_21;

public class SumNumInString {

	void sumOfNumbers(String input) {
		int sum = 0;
		for(int index = 0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int asciiValue = ch;
			if (asciiValue >= 48 && asciiValue <= 57) {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num;
		    } 
		}
		System.out.println("Sum of all digits in string is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SumNumInString().sumOfNumbers("J7yu9y8h1h8j4b7j3jjb6");
	}

}
