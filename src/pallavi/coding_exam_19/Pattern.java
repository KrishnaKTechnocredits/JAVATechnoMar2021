package pallavi.coding_exam_19;

public class Pattern {

	static void pattern(String str) {
		for(int i=1;i<=str.length();i++) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j)+ " ");
				}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String str="GLOBANT";
		Pattern.pattern(str);
	}
}
