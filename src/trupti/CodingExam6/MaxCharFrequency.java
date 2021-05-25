package trupti.CodingExam6;

import java.util.Scanner;

public class MaxCharFrequency {
	int getCharFrequency(String str,char targetChar) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==targetChar)
				count++;
		}
		return count;
	}
	char getMaxCharFrequency(String str) {
		str=str.toLowerCase();
		int max=0;
		char ch='*';
		for(int index=0;index<str.length();index++) {
			char targetChar=str.charAt(index);
			if(index==str.indexOf(targetChar)) {
				int cnt=getCharFrequency(str,targetChar);
				if(max<cnt) {
					max=cnt;
					ch=targetChar;
				}	 
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		MaxCharFrequency maxcharfrequency =new MaxCharFrequency ();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=scanner.nextLine();
		char output=maxcharfrequency.getMaxCharFrequency(str);
		System.out.println("Maximum character frequency :"+output);

	}

}
