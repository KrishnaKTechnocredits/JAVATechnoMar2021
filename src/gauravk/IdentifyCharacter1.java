package gauravk;

import java.util.Scanner;

public class IdentifyCharacter1{
	  
	  
	  void identify(char c){
	    if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	    System.out.println("Character "+c+" is vovel.");
	    else System.out.println("Character "+c+" is not a vovel.");
	  }

	  public static void main(String[] args){
	    
		System.out.println("Type any character: ");
	    Scanner inp = new Scanner(System.in);
	    String input = inp.nextLine();
	    char ch = input.charAt(0);
	    IdentifyCharacter1 identifyCharacter1 = new IdentifyCharacter1();
	    identifyCharacter1.identify(ch);
	  }
	}