package amrutaM.Assignment24;

/*Program 2 : 
Max repeating word with its freq. 
input : Hi Hello Hi Techno Hello Hi 
output : Hi -> 3 
*/
public class MaxWordFreq {

	void getMaxFreqWord(String input) {
		int wordCount = 1;
		String[] arr = input.split(" ");
		String word = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if(word.equals(arr[index]) ){
				wordCount++;
			}
		}
		System.out.println("Repeating word is--> "+word +", and it's frequency is "+wordCount);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		new MaxWordFreq().getMaxFreqWord(input);
	}
}
