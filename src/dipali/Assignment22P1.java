
// Assignment 20 A and B program 
package dipali;

public class Assignment22P1 {
	
	public void getFrequencyOfCharacterFromString(String Name , char ch) {
		int Counter=0;
		if(Name !=null) {
			int len=Name.length();
			for(int cnt=0; cnt<len;cnt++) {
				if(Name.charAt(cnt)==ch) {
					Counter++;
				}
			}
			
		}
			if(Counter >0)
				System.out.println("Character ["+ch+"] found in String ["+Name+"] for ["+Counter+"] times");
			else
				System.out.println("Character ["+ch+"] not found in String ["+Name+"]");
	} 

	public static void main(String[] args) {
		Assignment22P1 assignment22p1=new Assignment22P1();	
		System.out.println("Assignment 20 A program output : ");
		assignment22p1.getFrequencyOfCharacterFromString("technocredits",'e') ;
		System.out.println("......................................................................");
		System.out.println("Assignment 20 B program output : ");
		assignment22p1.getFrequencyOfCharacterFromString("aakanksha",'a') ;
		assignment22p1.getFrequencyOfCharacterFromString("aakanksha",'k') ;
		assignment22p1.getFrequencyOfCharacterFromString("aakanksha",'n') ;
		assignment22p1.getFrequencyOfCharacterFromString("aakanksha",'s');
		assignment22p1.getFrequencyOfCharacterFromString("aakanksha",'h') ;
	}
}
