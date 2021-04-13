package ashwini.assignment16;

import java.util.Scanner;

public class FrequencyOfCharecterInString {
	int count ;
	char character;

	void checkReapetations(String string, char ch){
		character =ch;
		for(int index = 0; index < (string.length()); index ++){
			if(string.charAt(index) == ch){			
				count++;
			}
		}
	}	
	void display(){
		System.out.print("charecter "+ character + " reapeted in string for  :");
		System.out.println(count);
	}

	public static void main(String[] args) {
		FrequencyOfCharecterInString frequency = new FrequencyOfCharecterInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inputString = sc.nextLine();
		System.out.println("Enter Character for which frequency required :");
		char ch = sc.next().charAt(0);
		frequency.checkReapetations(inputString, ch);	
		frequency.display();
		sc.close();

	}

}
