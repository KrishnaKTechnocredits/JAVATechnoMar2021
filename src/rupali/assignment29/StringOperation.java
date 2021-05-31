/*
 * Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
 */
package rupali.assignment29;

public class StringOperation {
	void  getFormattedString(String str) {
		String upperstr="",lowerstr="",temp="";
		int evencount=0,oddcount=0,num=0;
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))  
				temp=temp+str.charAt(index);
			else if(!Character.isDigit(str.charAt(index))) {
					if(!temp.equals("")) {
						num=Integer.parseInt(temp);
						if(num%2==0)
							evencount=evencount+num;
						else {
							oddcount=oddcount+num;
						}
					}
				temp="";
			}
			if(Character.isUpperCase(str.charAt(index)))
				upperstr=upperstr+str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				lowerstr=lowerstr+str.charAt(index);
		}
		if(!temp.equals("")) {
			num=Integer.parseInt(temp);
			if(num%2==0) {
				evencount=evencount+num;
			}else {
				oddcount=oddcount+num;
			}
		}	
		System.out.println("Required output="+oddcount+upperstr+lowerstr+evencount);	
	}
	public static void main(String[] args) {
		String input="F12TT45ERT5cc56de111";
		System.out.println("Given string= "+input);
		new StringOperation().getFormattedString(input);
	}
}
