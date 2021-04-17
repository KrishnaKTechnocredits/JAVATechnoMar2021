package trupti.ChracterFrequency;

import java.util.Scanner;

public class StringCharFreq {
	 
	void printFrequency(String str) {
		SingleCharFreq singlecharfreq = new SingleCharFreq();
		for(int index=0; index<str.length(); index++) {
				char ch =str.charAt(index);
				if(index==str.indexOf(ch)) {
					int cnt=singlecharfreq.getCharFreq(str,ch);
					System.out.println(ch+" -> "+cnt+ " time in "+ str );
				}
				
		}
	}

	public static void main(String[] args) {
		StringCharFreq stringcharfreq = new StringCharFreq();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=scanner.nextLine();
	    stringcharfreq.printFrequency(str);

	}

}
