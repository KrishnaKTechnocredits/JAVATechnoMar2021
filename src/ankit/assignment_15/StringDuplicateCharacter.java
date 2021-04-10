package ankit.assignment_15;

import java.util.Scanner;

public class StringDuplicateCharacter {
	int count ;
	char character;

	void checkDuplicate(String inpString, char ch){
		character =ch;
		for(int index = 0; index < (inpString.length()); index ++){
			if(inpString.charAt(index) == ch){			
				count = count+1;
			}
		}
	}	
	void display(){
		System.out.print(character +" Character repetative frequency is : ");
		System.out.println(count);
	}
	public static void main(String[] args) {
		StringDuplicateCharacter stringDuplicateCharacter = new StringDuplicateCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inputString = sc.nextLine().toUpperCase();
		System.out.println("Enter Character for which frequency required :");
		char ch = Character.toUpperCase(sc.next().charAt(0));
		stringDuplicateCharacter.checkDuplicate(inputString, ch);	
		stringDuplicateCharacter.display();
		sc.close();
	}
}
