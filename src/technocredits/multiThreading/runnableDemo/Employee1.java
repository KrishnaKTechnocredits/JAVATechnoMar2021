package technocredits.multiThreading.runnableDemo;

public class Employee1 implements Runnable{

	void m1() {
		for(int index=1;index<=100;index++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +":" + index);
		}
	}

	@Override
	public void run() {
		m1();
	}
}
