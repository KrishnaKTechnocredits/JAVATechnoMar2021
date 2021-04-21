package monali.Assignment_18;

public class Program_4 {

	void getAsciiValue() {
		for (int num = 97; num <= 122; num++) {
			char ch = (char) num;
			System.out.println(ch);
		}
	}

	public static void main(String[] a) {
		Program_4 program = new Program_4();
		program.getAsciiValue();
	}

}
