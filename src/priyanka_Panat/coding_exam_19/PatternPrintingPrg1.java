package priyanka_Panat.coding_exam_19;

public class PatternPrintingPrg1 {
	public static void main(String[] args) {
		String str = "GLOBANT";
		char[] ch = str.toCharArray();
		for (int index = 0; index < ch.length; index++) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				System.out.print(ch[innerIndex] + " ");
			}
			System.out.println();
		}
	}
}
