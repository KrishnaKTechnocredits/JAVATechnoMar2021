/*Write PrintName program*/

package parakh_Assignment;

public class PrintName {
	
	void displayName(String Name){
		System.out.println("Your name is: " +Name);		
	}
	
	public static void main(String args[]) {
		PrintName printname = new PrintName();
		printname.displayName("Parakh Singhai");
	}

}
