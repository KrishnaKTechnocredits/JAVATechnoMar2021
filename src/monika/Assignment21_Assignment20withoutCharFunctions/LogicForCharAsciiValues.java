package monika.Assignment21_Assignment20withoutCharFunctions;
/*Assignment20 part2
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class LogicForCharAsciiValues {

	void getOutput(String input) {	
		char c1 = '7';
		int i = (int)c1;
		char d = '7';
		int id = (int)d;
		System.out.println(c1+d);
		System.out.println(i+id);
		
	//	Character.getNumericValue(d);
		
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			int c = input.charAt(index);
			if(c>48 && c<=57) {
				sum+=(c-48);
			}
		}
		System.out.println(sum);
		System.out.println((char)58);
	}
	
	public static void main(String[] args) {
		LogicForCharAsciiValues obj = new LogicForCharAsciiValues();
		obj.getOutput("A");
	}
	
}
