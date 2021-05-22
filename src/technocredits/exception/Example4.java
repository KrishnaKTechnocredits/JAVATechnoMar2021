package technocredits.exception;

public class Example4 {

	void m1(int x) {
		try {
			int z = 10/x;
			clone(); // 
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Example4().m1(0);
		System.out.println("End");
	}
}
