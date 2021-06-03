package madhavi_Raut.CodingExam.Exam_19;

/*Program 1 - Print below pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T*/
public class PrintPattern01 {

	void displayPattern01(String str) {
		for (int row = 0; row < str.length(); row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(str.charAt(col));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PrintPattern01().displayPattern01("GLOBANT");
	}
}
