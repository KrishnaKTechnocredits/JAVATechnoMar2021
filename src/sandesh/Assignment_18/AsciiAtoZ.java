package sandesh.Assignment_18;

public class AsciiAtoZ {
	
	void getAscii(){
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + "'s Ascii value is - " + (int)ch);
		}
	}
	
	public static void main(String[] args) {
		AsciiAtoZ az1 = new AsciiAtoZ();
		az1.getAscii();
	}
}
