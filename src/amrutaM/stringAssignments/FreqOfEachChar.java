package amrutaM.stringAssignments;

public class FreqOfEachChar {

	void getCharFrequency(String str, char ch) {
		int count =0;
		for(int index=0; index<str.length();index++) {
			if(str.charAt(index)==ch)
				count++;
		}
		System.out.println("Frequency of "+ ch +" is : " + count);
	}
	
	void getAllCharFreq(String input) {
		for(int index = 0; index< input.length();index++) {
			char ch = input.charAt(index);
			if(index==input.indexOf(ch))
				getCharFrequency(input, input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		String input ="globant india is hiring";
		FreqOfEachChar freqOfEachChar = new FreqOfEachChar();
		//freqOfEachChar.getCharFrequency(input, 'e');
		freqOfEachChar.getAllCharFreq(input);
	}
}
