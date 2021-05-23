package sandesh.OWN_Practice_Sandesh_1;

public class PrintReverseNumber {

	private int getReverse(int input) {
		int revNum = 0;
		int mod = 0;
		while (input > 0) {
			mod = input % 10;
			revNum = revNum * 10 + mod;
			input = input / 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		int input = 631;
		int revNum = new PrintReverseNumber().getReverse(input);
		System.out.println("Reverse of given number is -: " + revNum);
	}
}
