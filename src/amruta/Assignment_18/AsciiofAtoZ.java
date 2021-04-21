/* Assignment 18 : 14th April'2021 Program 3: 
 write a method which will print ascii value of A to Z.
*/

package amruta.Assignment_18;

public class AsciiofAtoZ {
	
void getAsciivalueofChar(){
		
		for(char ch = 'A'; ch <= 'Z'; ch++){
			
			int num = (int)ch;
			System.out.println("Ascii value of character "+ch+ " is : " +num);
		}
	} 
	
	public static void main(String[] args) {
	  new AsciiofAtoZ().getAsciivalueofChar();	
	}
}
