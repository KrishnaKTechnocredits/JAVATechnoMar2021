package technocredits;

public class Example8 {
	
	void printCharFreq(String str, char targetChar){
		int count = 0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index) == targetChar)
				count++;
		}
		System.out.println("Freq of char " + targetChar + " is " + count);
	}
	
	void getFreqOfAllChar(String word) {
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			if(index == word.indexOf(ch)) {
				printCharFreq(word, word.charAt(index));
			}
		}
	}
	
	void doTest1() {
		String str = "par_$$$....123as";
		int count = 0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isLetter(ch))
					count++;
		}
		System.out.println(count);
	}
	
	void doTest() {
		String str = "12349";
		char[] stringToCharArr = str.toCharArray();
		int identifiedDigit = 57 - 48; // 49
		//char ch = (char)identifiedDigit;
		System.out.println(identifiedDigit);
		
		String str1 ="ABC";
		int ch1 = str1.charAt(0) + 32;
		System.out.println((char)ch1); // 97
	
		int ascii = 67;
		char ch = (char)ascii;
		
	}
	
	public static void main(String[] args) {
		Example8 example8 = new Example8();
		String word = "technocredit";
		//example8.getFreqOfAllChar(word);
		example8.doTest1();
		/*System.out.println(word.indexOf('c')); // 2
		System.out.println(word.lastIndexOf('c')); //
		System.out.println(word.indexOf('h'));
		System.out.println(word.lastIndexOf('h'));*/
	}
}
