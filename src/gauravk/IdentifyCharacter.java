package gauravk;
/* #1. WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
*/

public class IdentifyCharacter{
  
  
  void identify(char c){
    if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    System.out.println("Character "+c+" is vovel.");
    else System.out.println("Character "+c+" is not a vovel.");
  }

  public static void main(String[] args){
    IdentifyCharacter identifyCharacter = new IdentifyCharacter();
    identifyCharacter.identify('m');
  }
}