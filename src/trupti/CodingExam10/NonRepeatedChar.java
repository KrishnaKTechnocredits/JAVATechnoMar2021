package trupti.CodingExam10;

public class NonRepeatedChar {
	char firstNonRepeatedChar(String input) {

		char output='$';
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(input.indexOf(ch) == input.lastIndexOf(ch))
				return ch;
		}

		return output;
	} 

	public static void main(String[] args) {
		char output = new NonRepeatedChar().firstNonRepeatedChar("abcgbca");
		if(output=='$')
			System.out.println("Character with single occurence : None");
		else
			System.out.println("First Character with single occurence : " + output);

	}

}
