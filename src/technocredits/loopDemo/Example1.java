package technocredits.loopDemo;

public class Example1 {
	
	void display() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println(i*j);
			}
		}
	}
	
	public static void main(String[] args) {
		new Example1().display();
	}
}
