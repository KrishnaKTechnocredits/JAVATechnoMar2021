package technocredits.arrayDemo.setDemo;

public class Example12 {

	public static void main(String[] args) {
		new Example11() {
			@Override
			void m1() {
				System.out.println("helllooo");
			}
		}.m1();
	}
}
