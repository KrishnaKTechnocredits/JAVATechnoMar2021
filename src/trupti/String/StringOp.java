package trupti.String;
import java.util.Scanner;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2*/

public class StringOp {

	int getFrequencyCount(String str,char targetChar) {
		int count=0;
		int length=str.length();
		str=str.toLowerCase();
		targetChar=Character.toLowerCase(targetChar);

		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==targetChar)
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		StringOp stringop=new StringOp();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
		String input=scanner.nextLine();
		System.out.println("Enter Character for frequency :");
		String input1=scanner.nextLine();
		char ch=input1.charAt(0);
		int cnt;
		cnt= stringop.getFrequencyCount(input,ch);
		scanner.close();
		System.out.println("Output "+ch+"->"+cnt);
		

	}

}
