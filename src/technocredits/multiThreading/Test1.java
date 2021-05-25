package technocredits.multiThreading;

public class Test1 {

	public static void main(String[] args) {

		try {
			System.out.println(m1());
		} catch (Exception e) {
			System.out.print("in catch 1\t");
		}
		System.out.print("end");
	}

	private static int m1() {
		try {
			Integer.parseInt("5m");		
		} finally {
			System.out.println("finally");
			return 10;
		}
		//return null;
	}
}
