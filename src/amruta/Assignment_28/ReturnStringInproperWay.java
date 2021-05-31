/* Write a method to return String having all numeric numbers first followed by 
 * Capital letter followed by Small letter. 
 * 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis  */

package amruta.Assignment_28;

public class ReturnStringInproperWay {
	
	String printStringProperly(String str) {
		
		String digit = "";
		String upper = "";
		String lower = "";
		String specialcharacter = "";
		
		for(int index=0; index< str.length();index++) {
			
			char ch = str.charAt(index);
			
			if(Character.isDigit(ch)) {
				digit = digit + ch;

			}else if(Character.isUpperCase(ch)) {
				upper = upper + ch;
		
			}else if (Character.isLowerCase(ch)){
				lower += ch;
			}else
				specialcharacter += ch;
							
		}
		 
//		String output = digit+upper+lower+specialcharacter;
//		return output;
		
		return digit+upper+lower+specialcharacter;
		
	}
	
	
	public static void main(String[] args) {
		String msg = "Te1Ch2noCr4e_%$d8iTs9";
		
		String string = new ReturnStringInproperWay().printStringProperly(msg);
		
		System.out.println("String In proper way : "+ string);
	}

}
