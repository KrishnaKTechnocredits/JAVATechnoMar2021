package milind.Assignment_16;

import java.util.Scanner;

public class FrequencyOfChar {
	int getFequencyCount(String str,char targetchar) {
		int count=0;
		int length=str.length();
		str=str.toLowerCase();
		targetchar=Character.toLowerCase(targetchar);
		
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==targetchar)
				count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		FrequencyOfChar frequency=new FrequencyOfChar();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String input=scanner.nextLine();
		System.out.println("Enter Charecter for Frequency : ");
		String input1=scanner.nextLine();
		char ch=input1.charAt(0);
		int cnt;
		cnt=frequency.getFequencyCount(input,ch);
		scanner.close();
		System.out.println("Output "+ch+"-"+cnt);
	}
}
