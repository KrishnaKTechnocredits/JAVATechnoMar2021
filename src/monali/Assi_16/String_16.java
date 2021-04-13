package monali.Assi_16;

import java.util.Scanner;

	public class String_16 {

	String str = "scanner.next";
		char ch = 'e';
		
		void getCharFrequency(String str,char targetchar) {
		int length = str.length();
		int count = 0;
		
		str = str.toUpperCase();
		targetchar = Character.toUpperCase(targetchar);
		
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index) == targetchar)
			count++;
		}
		System.out.println("total char are "+count);
		}
		
		public static void main(String[] a) {
			String_16 assi_15_2 = new String_16();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter name ");
			String str = scanner.nextLine();
			System.out.println("Enter char ");
			String input1 = scanner.next();
            char targetchar = input1.charAt(0);
            assi_15_2.getCharFrequency( str,targetchar);
			
			}
	}



