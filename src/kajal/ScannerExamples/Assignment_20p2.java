package kajal.ScannerExamples;

public class Assignment_20p2 {
			
		void printChar() {
			int sum=0;
			int tmp=0;
			String str= "kj2ta3hj4";
				for(int i=0; i<str.length(); i++) {
					char ch= str.charAt(i);
					if (Character.isDigit(str.charAt(i))) 
			        sum= sum+(Character.getNumericValue(ch));
				}
				
				System.out.println("sum  "+sum);
			}
			
		public static void main(String [] arg) {
			  new Assignment_20p2().printChar();
		}

}
