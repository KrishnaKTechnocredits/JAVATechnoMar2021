package prachi.Coding_Exam_6;

public class ReturnMaxCharInString {

	void getMaxChar() {
		int firstChar, adjescebtChar,  max;          
		String str = "globant india is hiring";  
		int[] freq = new int[str.length()];  
		char maxChar = str.charAt(0);  
		char string[] = str.toCharArray(); 

		for(firstChar = 0; firstChar < string.length; firstChar++) {  
			freq[firstChar] = 1;  
			for(adjescebtChar = firstChar+1; adjescebtChar < string.length; adjescebtChar++) {  
				if(string[firstChar] == string[adjescebtChar]) {  
					freq[firstChar]++;  
				}  
			}  
		} 
		
		max = freq[0];  
		for(firstChar = 0; firstChar < freq.length; firstChar++) {  
			if(max < freq[firstChar]) {  
				max = freq[firstChar];  
				maxChar = string[firstChar];  
			}  
		} 
		System.out.println("Output of Maximum frequency character is: " + maxChar);  
	}

	public static void main(String[] args) { 
		ReturnMaxCharInString rcs = new ReturnMaxCharInString();
		rcs.getMaxChar();
	}  
}  
