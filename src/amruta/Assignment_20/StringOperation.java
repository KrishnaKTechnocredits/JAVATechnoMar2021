/*  Assignment 20: 14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

*/

package amruta.Assignment_20;

class StringOperation{
	
	void getCountAll(String str){
		
		int uppercasecount=0 , lowercasecount=0, digitcount = 0, specialcharcount = 0;
		
		for(int index = 0; index<str.length();index++){
			
			char ch = str.charAt(index);
		
			if(Character.isUpperCase(ch)){
				uppercasecount++;
			}else if(Character.isLowerCase(ch)){
				lowercasecount++;
			}else if(Character.isDigit(ch)){
				digitcount++;
			}else{
				specialcharcount++;
			}
		}
			System.out.println("Total Count of Letters : "+(uppercasecount + lowercasecount));
			System.out.println("Total Count of UpperCase Characters : "+uppercasecount);
			System.out.println("Total Count of LowerCase Charaacters : "+lowercasecount);
			System.out.println("Total Count of Digit : "+digitcount);
			System.out.println("Total Count of Special Characters : "+specialcharcount);
	}

	public static void main(String[] args){
	
	String str = "1rRpd3F9#K(E";
	new StringOperation().getCountAll(str);
	
	}

}