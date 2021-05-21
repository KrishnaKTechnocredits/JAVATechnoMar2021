package upasana.assignment_19;

import java.util.Scanner;
public class CountUpperCaseLowerCase {
	static int count1,count2;
	String Count() {
		if(count1>count2)
			return "Techno";
		else
			return "Credits";
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input");
		String str=scanner.next();
		for(int index=0;index<str.length();index++) {
			if(Character.isUpperCase(str.charAt(index)))
				count1++;
			else
				count2++;
		}
		System.out.println(new CountUpperCaseLowerCase().Count());
		scanner.close();
		}
		
}
