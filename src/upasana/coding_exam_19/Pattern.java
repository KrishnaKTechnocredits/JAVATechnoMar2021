/*
 G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T

G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G
 */

package upasana.coding_exam_19;

public class Pattern {

	void pattern1(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
	}

	void pattern2(String str) {
		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String str = "GLOBANT";
		Pattern pattern = new Pattern();
		pattern.pattern1(str);
		pattern.pattern2(str);
	}
}
