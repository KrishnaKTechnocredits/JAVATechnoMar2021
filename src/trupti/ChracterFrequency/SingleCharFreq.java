package trupti.ChracterFrequency;

import java.util.Scanner;

public class SingleCharFreq {
	int getCharFreq(String str,char targetChar) {
		int count=0;
		str=str.toLowerCase();
		targetChar=Character.toLowerCase(targetChar);
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)==targetChar)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		SingleCharFreq singlecharfreq = new SingleCharFreq();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=scanner.nextLine();
		System.out.println("Enter target Character :");
		String input=scanner.nextLine();
		char ch=input.charAt(0);
		int cnt=singlecharfreq.getCharFreq(str,ch);
		scanner.close();
		System.out.println(ch+ " -> "+cnt+" time in "+str);



	}

}
