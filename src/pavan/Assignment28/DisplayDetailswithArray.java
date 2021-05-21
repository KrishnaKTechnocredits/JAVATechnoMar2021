
/*
 Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */

package pavan.Assignment28;

import java.util.Scanner;

public class DisplayDetailswithArray {
	
	String getDetailshere(String input) {
		boolean b;
		String isDigit="";
		String isUppercase=" ";
		String isLowerCase=" ";
		String output="";
		for(int index=0; index<input.length();index++){
			char ch= input.charAt(index);
				
			if(Character.isDigit(ch)){
				isDigit=isDigit+input.charAt(index);
				//System.out.println(ch); 
			}
			if (Character.isUpperCase(ch)) {
				isUppercase=isUppercase+input.charAt(index);
				//System.out.println(ch); 
			}
			
			if (Character.isLowerCase(ch)) {
				isLowerCase=isLowerCase+input.charAt(index);
				//System.out.println(ch); 
			}
			  output= isDigit+isUppercase+isLowerCase;
			
		}	 //System.out.println(output);
		
		return output; 
	}

	public static void main(String[] args){
			Scanner scan= new Scanner(System.in);
			System.out.println("please provide the String");
			String input= scan.next();
			DisplayDetailswithArray displayDetailswithArray= new DisplayDetailswithArray();
			String info =displayDetailswithArray.getDetailshere(input);
			System.out.println(info);
}
}
