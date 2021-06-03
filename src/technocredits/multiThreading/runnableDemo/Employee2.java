package technocredits.multiThreading.runnableDemo;

public class Employee2 implements Runnable{

	void m1() {
		for(int index=101;index<=200;index++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + index);
		}
	}

	@Override
	public void run() {
		m1();
	}
}
