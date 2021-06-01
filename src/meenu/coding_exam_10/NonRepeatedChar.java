package meenu.coding_exam_10;

/*Print the first non-repeated character of String.
Input : abcgbca
output : g
*/

public class NonRepeatedChar {

	char getNonRepChar(String word) {
		char letter = word.charAt(0);
		int count = 1;
		for(int index = 0;index < word.length();index++) {
			for(int innerIndex = 0;innerIndex < index;innerIndex++) {
				if(word.charAt(index)== word.charAt(innerIndex)){
					count++;
					break;
				}	
			}	
				if(count == 1)
					letter = word.charAt(index);			
		}
		return letter;
	}
	public static void main(String[] args) {
		NonRepeatedChar nonRepeatedChar = new NonRepeatedChar();
		String word = "abcgbca";
		System.out.println(nonRepeatedChar.getNonRepChar(word));
	}
}
