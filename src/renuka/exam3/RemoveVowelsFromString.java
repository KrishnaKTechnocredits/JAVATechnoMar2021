package renuka.exam3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer
 
 output :  glbnt nd tst tmtn ngnr
*/

public class RemoveVowelsFromString {
	
	String getVowels(String input) {
		String temp = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			//if(Character.isLetter(ch)/!Character.isDigit(ch)) {
				if(((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u')) && ((ch != 'A') && (ch != 'E') && (ch != 'I') && (ch != 'O') && (ch != 'U'))) {
					temp += Character.toString(ch);		
			    }
			//}
			
		}
		return temp;	
	}

	public static void main(String[] args) {
		RemoveVowelsFromString printString = new RemoveVowelsFromString();
		String output = printString.getVowels("globant india test automation engineer");
		System.out.println(output);

	}

}
