package kajal.ScannerExamples;
import java.util.Scanner;

public class Assignment20 {
		
		void printChar() {
			int cnt=0;
			int cnt1=0;
			int cnt2=0;
			int cnt3=0;
			
			String str= "1rRpd3F9#k(E";
					
			for(int i=0; i<str.length(); i++) {
				if(Character.isUpperCase(str.charAt(i)))
					cnt++;
				else if(Character.isLowerCase(str.charAt(i)))
					cnt1++;
				else if(Character.isDigit(str.charAt(i)))
					cnt2++;
				else
					cnt3++;
					
			}
			
			System.out.println("upparcase chracter count in given string is "+ cnt);
			System.out.println("lowercase chracter count in given string is "+ cnt1);
			System.out.println("Total letter count in given string is "+ (cnt1+cnt));
			System.out.println("Digits is given string is "+ cnt2);
			System.out.println("special chracters in given string is "+ cnt3);
		}
		
		public static void main(String [] arg) {
		    new Assignment20().printChar();
		}
}
