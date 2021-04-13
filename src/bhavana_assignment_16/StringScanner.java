package bhavana_assignment_16;


import java.util.Scanner;

public class StringScanner {
		
	void frequency(String str,char ch) {
		int frequencyCount=0;
		for(int index=0;index<str.length();index++){
			if(str.charAt(index)==ch)
				frequencyCount++;
		}
			System.out.println(" There are "+frequencyCount+" times "+ch+" in the "+str);
		
	}
		public static void main(String a[]) {
			
			StringScanner sc=new StringScanner();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string");
			String inputString=scanner.next();
			System.out.println("Enter the character");
			char inputChar=scanner.next().charAt(0);
			inputChar=Character.toLowerCase(inputChar);
			sc.frequency(inputString, inputChar);
			scanner.close();
		}
	
	
}
