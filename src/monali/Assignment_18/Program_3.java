package monali.Assignment_18;

public class Program_3 {
	
	void getAsciiValue() {
		 for(int num = 65; num<=90; num++) {
			char ch = (char)num;
	         System.out.println(ch);
	}
	}
	
	public static void main(String[] a) {
		Program_3 program = new Program_3();
		program.getAsciiValue();
}
}
