package technocredits.StringDemo;

public class Example12 {

	static int getWordCount(String str){
		int count = 0;
		while(str.contains("techno")){
			count++;
			str = str.replaceFirst("techno","");
		}
		System.out.println(count);
		return count;
	}
	
	static int getWordCountWithoutLoop(String input, String word) {
		int count = 0;
		String[] arr = input.split(word);
		if(input.endsWith(word))
			count = arr.length;
		else
			count = arr.length - 1;
		
		System.out.println(count);
		return count;
	}
	
	static void getCharCount(String word, char ch) {

		int oLength = word.length();
		//char ch1 = '';
		word = word.replace(ch+"","");
		int nLength = word.length();
		System.out.println("Freq of e is :-> " + (oLength - nLength));
	}
	
	static private String swapLetters(String str) {
		boolean f1 = false;
		boolean f2 = false;
		char temp1 = ' '; // A D
		char temp2 = ' '; // D A
		char[] arr = str.toCharArray();
		
		for(int i=0,j=str.length()-1;i<j;) {
			if(Character.isLetter(str.charAt(i)) && f1 == false){
				f1 = true;
				temp1 = str.charAt(i); // 'A' // 0
			}else if(f1 == false){
				i++;
			}

			if(Character.isLetter(str.charAt(j)) && f2 == false){
				f2 = true;
				temp2 = str.charAt(j); // 'D' // 5
			}else if(f2 == false)
				j--;
			
			if(f1 == true && f2 == true) {
				arr[i] = temp2; // 'D'
				arr[j] = temp1; // 'A'
				f1 = false;
				f2 = false;
				i++; // 1
				j--; // 4
			}
		}
		String output = new String(arr);
		return output;
	}
	
	static String swapDigits(String str) {
		boolean f1 = false;
		boolean f2 = false;
		char temp1 = ' '; // A D
		char temp2 = ' '; // D A
		char[] arr = str.toCharArray();
		
		for(int i=0,j=str.length()-1;i<j;) {
			if(Character.isDigit(str.charAt(i)) && f1 == false){
				f1 = true;
				temp1 = str.charAt(i); // 'A' // 0
			}else if(f1 == false){
				i++;
			}

			if(Character.isDigit(str.charAt(j)) && f2 == false){
				f2 = true;
				temp2 = str.charAt(j); // 'D' // 5
			}else if(f2 == false)
				j--;
			
			if(f1 == true && f2 == true) {
				arr[i] = temp2; // 'D'
				arr[j] = temp1; // 'A'
				f1 = false;
				f2 = false;
				i++; // 1
				j--; // 4
			}
		}
		String output = new String(arr);
		return output;
	}
	
	static void m1() {
		// AB1C2D3 -> DC3B2A1
		String str = "AB1C2D3"; // DC3B2A1
		str = swapLetters(str); // DC1B2A3
		str = swapDigits(str);
		System.out.println(str);
	}
	
	static public void main(String[] args) {
		 //Example12.getWordCount("hi techno hello techno hey techno Aashvi");
		 //Example12.getWordCountWithoutLoop("hi techno hello hi hi hi techno hey techno Aashvi", "techno");
		// Example12.getWordCountWithoutLoop("hi hello hi hi hihey Aashvi", "techno");
		// Example12.getWordCountWithoutLoop("techno hi hello hi hi hihey Aashvi", "techno");
		// Example12.getWordCountWithoutLoop("hi hello hi hi hihey Aashvi techno", "techno");
		// Example12.getWordCountWithoutLoop("techno hi techno hello hi hi techno hihey Aashvi techno", "techno");
		// Example12.getCharCount("technocredits", 'e');
		Example12.m1();
	}
}
