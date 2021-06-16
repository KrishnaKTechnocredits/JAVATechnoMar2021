
/*Program 2 - Print below pattern
G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G*/

package pavan.PavanB_coding_exam_19;

public class PrintPattern02 {
	void displayPattern02(String str) {
		int count = str.length();
		for (int row = 0; row < str.length(); row++) {
			for (int col = 0; col < count; col++) {
				System.out.print(str.charAt(col));
			}
			count--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PrintPattern02().displayPattern02("GLOBANT");
	}

}
