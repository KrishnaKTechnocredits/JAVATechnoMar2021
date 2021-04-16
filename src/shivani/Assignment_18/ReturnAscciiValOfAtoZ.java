package shivani.Assignment_18;
//Program 3:  write a method which will print ascii value of A to Z.

public class ReturnAscciiValOfAtoZ {

	void asciiValue() {
		for (int i = 65; i <= 90; i++) {
			System.out.println("ASCII value of :" + ((char) i) + "-  " + i);
		}
	}

	public static void main(String[] args) {
		ReturnAscciiValOfAtoZ returnAscciiValOfAtoZ = new ReturnAscciiValOfAtoZ();
		returnAscciiValOfAtoZ.asciiValue();
	}

}
