package meenu.assignment_28;

/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
*/

public class ArrangeString{
			
	String getString(String word) {
		String numericNum = "";
		String capitalLetter = "";
		String smallLetter = "";
		for(int index = 0;index<word.length();index++) {			
			if(Character.isDigit(word.charAt(index)))
				numericNum = numericNum+word.charAt(index);
			else if(Character.isUpperCase(word.charAt(index)))
				capitalLetter = capitalLetter+word.charAt(index);
			else if(Character.isLowerCase(word.charAt(index)))
				smallLetter = smallLetter+word.charAt(index);			
		}
		String ouputStr = numericNum+capitalLetter+smallLetter;
		return ouputStr;
	}
		
		public static void main(String[] args){
			ArrangeString arrangeString = new ArrangeString();
			System.out.println("Output string is : "+arrangeString.getString("Te1Ch2noCr4e_%$d8iTs9"));
		}	
}
