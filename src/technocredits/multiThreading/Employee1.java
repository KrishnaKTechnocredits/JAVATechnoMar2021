package technocredits.multiThreading;

public class Employee1 extends Thread{
	
	@Override
	public void run(){
		try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void m1() throws InterruptedException {
		for(int index=1;index<=100;index++) {
			System.out.println(index);
			Thread.sleep(300);
		}
	}
}
