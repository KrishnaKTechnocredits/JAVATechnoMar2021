//Assignment22 
//b) Find all character frequency from given name.
//     Input: name - aakanksha
//     Output : a -> 4
//	          k -> 2
//              n -> 1
//              s -> 1
//              h -> 1

package neha_Rathi.assignment22;

public class AllCharFrequency {
	int temp=0;
	int cnt = 0;
	void charFreq(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				frequencyOfChar(input, ch);
		}
	}

	void frequencyOfChar(String input, char ch1) {
		
	
		for (int index = 0; index < input.length(); index++) {
			if (ch1 == input.charAt(index)) {
				cnt++;
		}}
		System.out.println(ch1 + " -> " + cnt + " time in " + input);
	}

	// this block is used for array of string
	void validateAllString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			charFreq(input[index]);
		}
	}

	public static void main(String[] args) {
		AllCharFrequency allCharFrequency = new AllCharFrequency();
		//String input = "aakanksha";
		//allCharFrequency.charFreq("globant india is hiring");
		String[] input1 = { "aakanksha" ,"neha"};
		allCharFrequency.validateAllString(input1);
	}
}
