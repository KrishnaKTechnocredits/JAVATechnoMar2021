package paras;

public class TestDisplay {
	void setName(String name) {
		System.out.println("User name is:" + name);
	}
	
	public static void main(String[] args) {
		TestDisplay display = new TestDisplay();
		display.setName("Paras");
	}
}