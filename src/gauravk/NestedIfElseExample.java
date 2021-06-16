package gauravk;

public class NestedIfElseExample {
	void printData(int marks) {
		if(marks >=0 && marks <=100) {
			if(marks >90)
				System.out.println("A+");
			else if(marks >80 && marks <=90)
				System.out.println("A");
			else
				System.out.println("You need more practice");
		} else {
			System.out.println("Invalid input");
			if(marks<0)
				System.out.println("You are providing negative inputs");
			else
				System.out.println("You cross max mark limit");
		}
	}
	public static void main(String[] args) {
		NestedIfElseExample nestedIfElseExample = new NestedIfElseExample();
		nestedIfElseExample.printData(88);
	}
}
