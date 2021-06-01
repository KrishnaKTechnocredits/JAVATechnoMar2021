/* Assignment 18 : 14th April'2021  Program 4: 
write a program which will print characters between ascii value 97 to 122.
*/

package amruta.Assignment_18;

public class Charof97to122 {
	
	void getCharacter(){
			for(int num = 97; num <= 122; num++){
				
				char ch = (char)num;
				System.out.println("Ascii value of character "+num+ " is : " +ch);
			}
		} 
	public static void main(String[] args) {
		new Charof97to122().getCharacter();
	}

}
