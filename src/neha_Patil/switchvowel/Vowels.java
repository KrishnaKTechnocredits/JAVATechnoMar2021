package neha_Patil.switchvowel;

public class Vowels {
	      void SwitchCase(char ch) {
		      switch(ch) {

		      case'a':
		      case'A':  
			     System.out.println(ch+" is a vowel");
			     break;
		      case'e':
		      case'E':  
			     System.out.println(ch+" is a vowel");
			     break;
			  case'i':
			  case'I':  
				  System.out.println(ch+" is a vowel");
				  break;
			  case'o':
			  case'O':  
				  System.out.println(ch+" is a vowel");
				  break;
			  case 'u':
			  case'U':  
				  System.out.println(ch+" is a vowel");
			    break;
			  default:
			    System.out.println("Invalid input");
			}
		      
	}
 public static void main( String[] args) {
	 Vowels vowel = new Vowels();
	 vowel.SwitchCase('a');
	 vowel.SwitchCase('d');
	 vowel.SwitchCase('i');
	 vowel.SwitchCase('6');
 }
 
}
