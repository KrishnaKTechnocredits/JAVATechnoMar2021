package monika.Array_Coding_Exam;

/*Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g*/
public class FindNonRepeatedCharsInString {

	public char getFirstNonRepeatedChar(String input) {
		for(int index=0;index<input.length();index++) {
			int indexOF = (input.indexOf(String.valueOf(input.charAt(index))));
			int lastIndexOf = input.lastIndexOf(String.valueOf(input.charAt(index)));
			if( indexOF == lastIndexOf) {
				return input.charAt(index);
			}
		}
		
		return 'F';
	}

	public static void main(String[] args) {
		FindNonRepeatedCharsInString obj = new FindNonRepeatedCharsInString();
		char result = obj.getFirstNonRepeatedChar("abcgbca");
		System.out.println(result);
	}

}
