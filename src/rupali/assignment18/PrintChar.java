/*
 * Program 4: write a program which will print characters between ascii value 97 to 122.
 */
package rupali.assignment18;


public class PrintChar {
	
	public static void main(String[] args) {
		PrintChar printchar=new PrintChar();
		
		
		for(int i=97;i<=122;i++)
			System.out.println("The character is "+(char)i+" for Ascci value "+i); 
	}

}
