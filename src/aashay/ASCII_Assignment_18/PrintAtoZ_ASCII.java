package aashay.ASCII_Assignment_18;
/*
 * Assignment 18 : 14th April'2021
Program 3: write a method which will print ascii value of A to Z.
 */

public class PrintAtoZ_ASCII {
	
	void asciiValue() {
		char [] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
		
		for(int i = 0; i <= arr.length-1; i++) {
			int c = arr[i];
			System.out.println("Character : "+arr[i]+" ASCII value ="+c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAtoZ_ASCII printAtoZ_ASCII = new PrintAtoZ_ASCII();
		printAtoZ_ASCII.asciiValue();
	}

}
