package purva.Assignment_22;

public class CharFrequency {
	//a. one char frequency from given name
	void oneCharFrequency(String input,char target) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == target)
				count++;
		}
		System.out.println("frequency of "+target+" in "+input+" is "+count);
	}
	
	//b. all character frequency from given name
	void allCharFrequency(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch))
				oneCharFrequency(input, input.charAt(index));
		}
	}
	
	//c.all char frequency from each name given in string array
	void allCharInArrayfrequency(String[] inputStr) {
		for (int index = 0; index < inputStr.length; index++) {
			allCharFrequency(inputStr[index]);
		}
	}

	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		charFrequency.oneCharFrequency("Technocredit", 'e');
		System.out.println("-------------------------------------------");
		String input ="aakanksha";
		charFrequency.allCharFrequency(input);
		System.out.println("-------------------------------------------");
		String[] inputStr = {"raj","aarya","aavruti","shruti"};
		charFrequency.allCharInArrayfrequency(inputStr);
		

	}
}
