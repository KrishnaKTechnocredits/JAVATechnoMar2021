package gauravk;

public class IfElseLadderExample1 {
	void displayName(int number) {
		if (number == 1) {
			System.out.println("Technocredit");
		}else if (number == 2) {
			System.out.println("Krishna");
		}else if (number ==3) {
			System.out.println("Harsh");
		}else {
			System.out.println("Maulik");
		}
	}
	public static void main(String[] args) {
		IfElseLadderExample1 ifElseLadderExample1 = new IfElseLadderExample1();
		ifElseLadderExample1.displayName(2);
	}
}
