package trupti.Array;

import java.util.Scanner;

/*Assignment - 17 : Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class MaxLengthOfName {
	String [] getArray(Scanner scanner) {
		System.out.println("How many names you want to enter? ");
		int size=scanner.nextInt();
		String [] stringArr=new String[size];
		
		for(int index=0;index<stringArr.length;index++) {
			System.out.println("Enter Name "+ (index+1) + " : ");
			stringArr[index]=scanner.next();
		}
		return stringArr;
	}

	String findMaxLengthName(String [] strArray) {
		String tempName="";
		int strLength=0;
		for(int index=1;index<strArray.length;index++) {
			if(strArray[index].length() >strLength) {
				strLength=strArray[index].length();
				tempName=strArray[index];
			}
		}

		return tempName;
	}

	public static void main(String[] args) {
		MaxLengthOfName maxlengthofname=new MaxLengthOfName();
		Scanner scanner=new Scanner(System.in);
		String [] strArray=maxlengthofname.getArray(scanner);
		String ans=maxlengthofname.findMaxLengthName(strArray);
		System.out.println ("String with maximum length is "+ ans);
		scanner.close();
	}

}
