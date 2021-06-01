package kangan.assignments.assignment_14;

import java.util.Scanner;

import kangan.assignments.assignment_13.Vowel;

public class VowelScanner_reusingMethods {
	
	
	  void vowels(char X) {
		  Vowel vowel = new Vowel();
		  vowel.isVowel(X);
	   }
	
  public static void main(String[] args) {
	  
	  VowelScanner_reusingMethods vowelScanner = new VowelScanner_reusingMethods();
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the alphabet");
	  String input = scanner.nextLine();
	  char ch = input.charAt(0);
	  vowelScanner.vowels(ch);
  }
}
	 
	 



