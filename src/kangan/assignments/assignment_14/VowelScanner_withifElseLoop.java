package kangan.assignments.assignment_14;

import java.util.Scanner;

public class VowelScanner_withifElseLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the alphabet");
		  String input = scanner.nextLine();
		  char ch = input.charAt(0);
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			System.out.println("Entered character "+ch+" is  Vowel"); 
			}
		  else if ((ch>'a'&&ch<='z')||(ch>'A'&&ch<='Z')) {
			  System.out.println("Entered character "+ch+" is Consonant");
		  }
		      else
			System.out.println("Not an alphabet");
		  }
	}

