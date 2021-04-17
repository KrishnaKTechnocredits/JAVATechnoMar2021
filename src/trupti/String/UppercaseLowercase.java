package trupti.String;

import java.util.Scanner;

public class UppercaseLowercase {
	String getUpperLower(String str) {
		
		int upperCaseCnt=0;
		for(int index=0;index<str.length();index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				upperCaseCnt++;
			}
		}
		if(upperCaseCnt > (str.length()-upperCaseCnt)) {
			return "Techno";
		}
		else {
			return "Credits";
		}

	}

	public static void main(String[] args) {
		UppercaseLowercase uppercaselowercase=new UppercaseLowercase();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");  
		String str=scanner.next();
		String ans=uppercaselowercase.getUpperLower(str);
		System.out.println("Output : "+ans);
		scanner.close();
	}

}
