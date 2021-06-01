/*
String msg ={ "Te1Ch2noCr4e_%$d8iTs9","Sour1abh2Sah3a"}
output : 12489TCCTehnoredis
		 123SSourabhaha
*/

//Program 2:

package sourabh.Assignment28_String;

public class ReturnArrayString {
	String getOneString(String strInput) {
		String getDigit="";
		String getUpperCase="";
		String getLowerCase="";
		for(int index=0; index<strInput.length(); index++) {
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
	
	String[] getAllString(String[] arrInput) {
		String[] arrOutput= new String[arrInput.length];
		for(int index1=0; index1< arrInput.length; index1++) {			
			arrOutput[index1]=getOneString(arrInput[index1]);
		}
		return arrOutput;
	}
	public static void main(String[] args) {
		ReturnArrayString returnArrayString= new ReturnArrayString();
		String[] arrInput= {"Te1Ch2noCr4e_%$d8iTs9","Sour1abh2Sah3a"};
		returnArrayString.getOneString("Te1Ch2noCr4e_%$d8iTs9");
		String[] arrOutput= returnArrayString.getAllString(arrInput);
		for(int index=0; index<arrOutput.length; index++) {
		System.out.println(arrOutput[index]);
		}
	}
}
