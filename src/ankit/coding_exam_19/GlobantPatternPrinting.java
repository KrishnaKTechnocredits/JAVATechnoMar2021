package ankit.coding_exam_19;

public class GlobantPatternPrinting {
	static public void globantPrinting(String str) {
		for(int index = 0 ; index < str.length(); index++) {
			for(int indexI = 0 ; indexI <= index ; indexI++) {
				System.out.print(str.charAt(indexI)+" ");
			}
			System.out.println();
		}
	}
	
	static public void globantReversePrinting(String str) {
		System.out.println();
		for(int index = 0 ; index < str.length(); index++) {
			for(int indexI = 0 ; indexI < str.length()-index ; indexI++) {
				System.out.print(str.charAt(indexI)+" ");
			}
			System.out.println();
		}
	}
	
	static public void globantPrintingMirror(String str) {
		System.out.println();
		for(int index = 0 ; index < str.length(); index++) {
			for(int indexJ = 0 ; indexJ < str.length()-index;indexJ++ ) {
				System.out.print(" ");
			}
			
			for(int indexI = 0 ; indexI <= index ; indexI++) {
				System.out.print(str.charAt(indexI));
			}
			System.out.println();
		}
	}
	
	static public void globantPrintingPyramid(String str) {
		System.out.println();
		for(int index = 0 ; index < str.length(); index++) {
			for(int indexJ = 0 ; indexJ < str.length()-index;indexJ++ ) {
				System.out.print(" ");
			}
			
			for(int indexI = 0 ; indexI <= index ; indexI++) {
				System.out.print(str.charAt(indexI)+ " ");
			}
			System.out.println();
		}
	}
	
	static public void globantPrintingSlash(String str) {
		System.out.println();
		for(int index = 0 ; index < str.length(); index++) {
			for(int indexI = 0 ; indexI <= index ; indexI++) {
				if(indexI==index) {
					System.out.print(str.charAt(indexI)+" ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	static public void globantReverseBackSlash(String str) {
		System.out.println();
		for(int index = 0 ; index < str.length(); index++) {
			for(int indexI = 0 ; indexI < str.length()-index ; indexI++) {
				if(indexI == str.length()-index-1) {
					System.out.print(str.charAt(indexI));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
	String str = "GLOBANT";
	globantPrinting(str);
	globantReversePrinting(str);
	globantPrintingMirror(str);
	globantPrintingPyramid(str);
	globantPrintingSlash(str);
	globantReverseBackSlash(str);
	}
}
