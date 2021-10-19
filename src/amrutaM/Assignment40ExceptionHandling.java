package amrutaM;
/*Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
3*/

public class Assignment40ExceptionHandling {

	static void getDigitsFromString(String str) {
		String temp ="";
		for(int index=0; index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))){
				temp+=str.charAt(index);
			}else if (!temp.equals("")) {
				int num = Integer.parseInt(temp);
				System.out.println(num);
				temp = "";
			}
		}
	}
	
	static void getDigitsFromString2(String str) {
		String temp ="";
		int num=0;
		String [] input = str.split(" ");
		for(int index =0; index<input.length;index++) {
			try {
				 num = Integer.parseInt(input[index]);
				 System.out.println(num);
				 break;
			}catch(NumberFormatException nfe) {
				//System.out.println("Not a number : " + input[index] );
			}
		}
	}
	public static void main(String[] args) {
		String str = "I have 15 years and 3 months of exp";
		getDigitsFromString2(str);
		
	}
}
