/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
*/

//Program 1:

package sourabh.Assignment28_String;

public class ReturnString {
	String getString(String strInput) {
		String getDigit="";
		String getUpperCase="";
		String getLowerCase="";
		for(int index=0; index<strInput.length();index++) {
			char checkCh= strInput.charAt(index);
			if(Character.isDigit(checkCh))
				getDigit= getDigit+checkCh;
			else if(Character.isUpperCase(checkCh))
				getUpperCase= getUpperCase+checkCh;
			else if(Character.isLowerCase(checkCh))
				getLowerCase= getLowerCase+checkCh;
		}
		return getDigit+getUpperCase+getLowerCase;
	}
	public static void main(String[] args) {
		ReturnString returnString= new ReturnString();		
		String strOutput=returnString.getString("Te1Ch2noCr4e_%$d8iTs9");
		System.out.println(strOutput);
	}
}
