package shivani;

class NumberGame {

	void findMaxNumber(int x, int y, int z) {
		if (x > y && x > z) {

			System.out.println("max number is =" + x);
		} else if (y > z) {
			System.out.println("max number is =" + y);
		} else if (x == y && y == z) {
			System.out.println("all number are identical");
		} else
			System.out.println("max number is = " + z);
	}

	void findMinNumber(int x, int y, int z) {
		if (x < y && x < z) {

			System.out.println("min number is =" + x);
		} else if (y < z) {
			System.out.println("max number is =" + y);
		} else if (x == y && y == z) {
			System.out.println("all number are identical");
		} else
			System.out.println("min number is = " + z);
	}

	public static void main(String[] args) {
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13, 14, 19);
		numberGame.findMinNumber(5, 8, 9);
		numberGame.findMaxNumber(19, 19, 19);
		numberGame.findMinNumber(13, 13, 13);
	}
}
