package purva.ScannerClass.StringArrayAssignment_16;

import java.util.Scanner;

 public class StringArray {
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
			System.out.print(character +" Character repetitive frequency is : ");
			System.out.println(count);
		}
		
		public static void main(String[] args) {
			StringArray stringArray = new StringArray();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String : ");
			String inputString = sc.nextLine().toUpperCase();
			System.out.println("Enter Character for which frequency required :");
			char ch = Character.toUpperCase(sc.next().charAt(0));
			stringArray.checkDuplicate(inputString, ch);	
			stringArray.display();
			sc.close();
		}
}

