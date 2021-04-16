package surabhi.assignment19;

import java.util.Scanner;

public class UpperCaseCount {
	 String printWord(String str) {
		 int countUpper=0, countLower=0;
		 for(int index=0; index<str.length();index++) {
			 char ch=str.charAt(index);
			 if(!Character.isDigit(ch)) {
				 if(Character.isUpperCase(ch)) {
					 countUpper++;
				 }else {
					 countLower++;
				 }
			 }
		 }
		 if(countUpper>=countLower) {
			 return "Techno";
		 }else
			 return "Credits";
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCaseCount upperCaseCount=new UpperCaseCount();   
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the string ");

		String str=scanner.next();
		System.out.println(upperCaseCount.printWord(str));
	}

}
