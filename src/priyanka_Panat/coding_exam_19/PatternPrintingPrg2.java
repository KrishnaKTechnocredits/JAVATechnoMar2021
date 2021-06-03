package priyanka_Panat.coding_exam_19;

public class PatternPrintingPrg2 {
	public static void main(String[] args) {
		String str = "GLOBANT";
		char[] ch = str.toCharArray();
		for (int index = ch.length - 1; index > 0; index--) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				System.out.print(ch[innerIndex]+ " ");
			}
			System.out.println();
		}
	}
}
