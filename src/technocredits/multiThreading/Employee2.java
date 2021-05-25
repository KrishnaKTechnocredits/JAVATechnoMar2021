package technocredits.multiThreading;

public class Employee2 extends Thread{

	@Override
	public void run() {
		m2();
	}
	
	void m2() {
		for(int index=101;index<=200;index++) {
			System.out.println(index);
			
		}
	}
}
