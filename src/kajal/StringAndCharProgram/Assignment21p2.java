package kajal.StringAndCharProgram;

public class Assignment21p2 {
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
		// method called here
		String str= "J7yu9y8h1h8j4b7j3jjb6";
        new Assignment21p2().sumOfNumbers(str);
	}

}
