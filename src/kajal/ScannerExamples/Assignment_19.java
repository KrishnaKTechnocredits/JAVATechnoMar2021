package kajal.ScannerExamples;
import java.util.Scanner;

public class Assignment_19 {
			
	static String printChar() {
		int cnt=0;
		int cnt1=0;
		String str= "TeCHnoSessionS";
			
			for(int i=0; i<str.length(); i++) {
				if(Character.isUpperCase(str.charAt(i)))
					cnt++;
				else 
					cnt1++;
			}
			if(cnt>cnt1)
				return "techno";
			
			else 
				return "credit";
	}
		
		public static void main(String [] arg) {
		    new Assignment_19().printChar();
		    System.out.println(printChar());
			
	}

}
