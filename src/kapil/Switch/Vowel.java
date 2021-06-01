// WAP to evaluate whether given character is vowel or not using switch case.

package kapil.Switch;

public class Vowel {
	
       void vowelch(char ch) {
    	  
    	  switch(ch) {
    	  case 'A':
    	  case 'a':
    		  System.out.println("a is a Vowel");
    		  break;
    	  case 'E':  
    	  case 'e':
 		      System.out.println("e is a Vowel");
 		      break;
    	  case 'i':
    		  System.out.println("i is  a Vowel");
    		  break;
    	  case 'I':	  
    		  System.out.println("I is a Vowel");
    		  break;
    	  case 'O':	  
    	  case 'o':
    		  System.out.println("o is a Vowel");
    		  break;
    	  case 'U':
    	  case 'u':
    		  System.out.println("u is a Vowel");
    		  break;  
    	  default :
    		  System.out.println("Alphabet is not a vowel");}
      }
    public static void main(String[] Args) {
           Vowel vowel = new Vowel();
           vowel.vowelch('d');
           vowel.vowelch('I');
           vowel.vowelch('i');
    }
}
