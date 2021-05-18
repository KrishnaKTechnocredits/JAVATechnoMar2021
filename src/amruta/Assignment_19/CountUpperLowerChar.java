/*Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits  */

package amruta.Assignment_19;

class CountUpperLowerChar{

	String getCount(String str){
		int uppercasecount=0 , lowercasecount=0;
		
		for(int index = 0; index<str.length();index++){
			
			char ch = str.charAt(index);
		
			if(Character.isUpperCase(ch))     // -- Instead of 'ch' -- we can directly write--- Character.isUpperCasestr(str.charAt(index))
				uppercasecount++;
			else 
				lowercasecount++;
		}
		System.out.println("Count of UpperCase characters = " +uppercasecount);
		System.out.println("Count of Lowercase characters = " +lowercasecount);
		
		if(uppercasecount > lowercasecount)
			return "Techno";
		else 
			return "Credits";
	}
		
	public static void main(String[] args){
		
		String str = "TeCHnoSessionS";
		//char ch = str.charAt(0);
		
		String ans = new CountUpperLowerChar().getCount(str);
		System.out.println("Return : " +ans);
	}
}