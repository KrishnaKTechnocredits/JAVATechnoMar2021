package technocredits.exception;

public class Example6 {
	void m2(){
		System.out.println(3); // 4
		m3(0); // 5
		System.out.println(4);
	}
	
	void m3(int y){
		System.out.println(1); // 6
		int x = 10/y; //7
		System.out.println(2);

	}
}
