/*  Assignment 21: 14th April'2021  Without using Character Class Methods

Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

*/

package amruta.Assignment_21;

class CountCharacterusingSingleLoop {

	static int uppercasecount=0 , lowercasecount=0, digitcount = 0, specialcharcount = 0;
	
	void getcountofValues(String str){
		
		for(int index = 0; index<str.length();index++){
		
			char ch = str.charAt(index);
			
			if(ch >= 65 && ch <= 90){
				uppercasecount++;
				
			}else if(ch >= 97 && ch <= 122){
				lowercasecount++;
				
			}else if(ch >= 48 && ch <= 57){
				digitcount++;
				
			}else
				specialcharcount++;
		}
	}
	
	void display() {
		
		System.out.println("Total Count of Letters : "+(uppercasecount+lowercasecount));
		System.out.println("Total Count of UpperCase Characters : "+uppercasecount);
		System.out.println("Total Count of UpperCase Characters : "+lowercasecount);
		System.out.println("Total Count of Digit : "+digitcount);
		System.out.println("Total Count of Special character : "+specialcharcount);
	}
	
	public static void main(String[] args){
	
		String str = "1rRpd3F9#K(E";
		new CountCharacterusingSingleLoop().getcountofValues(str);
		new CountCharacterusingSingleLoop().display();
	
	}
}

