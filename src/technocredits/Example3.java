package technocredits;

class Example3{
	int x = 0; // 20
	
	void m1(){
		System.out.println(x); // 0
		x = 20;
		System.out.println(x); // 20
	}
	
	void m2(){
		int x = 30; 
		System.out.println(x); //30
		x = x + 1;
		System.out.println(x); //31
	}
	
	void m3(){
		System.out.println(x); // 0
	}
	
	public static void main(String[] args){
		Example3 example3 = new Example3();
		example3.m1();
		example3.m3();
		example3.m2();
	}
}
// 0 20  20 30 31
// 0 20  0 30 31

