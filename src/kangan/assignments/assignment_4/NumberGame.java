package kangan.assignments.assignment_4;

public class NumberGame {
	
	void findMaxNumber(int x, int y, int z) {
		if (x==y && y==z) {
			System.out.println("Maximum number could not found, All given numbers are equals");
		}
		else if (x>y && x>z) {
			System.out.println("Maximum number is " + x);
		}
		else if (y>z) {
			System.out.println("Maximum number is " + y);
		}
		else {
			System.out.println("Maximum number is " + z);
	}
	}
	void findMinNumber(int x, int y, int z) {
		if (x==y &&y ==z){
			System.out.println("Minimum number could not found, All given numbers equal numbers");
	     }
		else if (x<y && x<z) {
			System.out.println("Minimum number is " + x);
		}
		else if (y<z) {
			System.out.println("Minimum number is " + y);
		}
		else {
			System.out.println("Minimum number is " + z);
	}
	}
	public static void main(String[] args) {
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(5,12,11);
		numberGame.findMinNumber(1,1,1);
	}
}
