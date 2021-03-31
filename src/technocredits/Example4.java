package technocredits;

class Example4{
	int x = 0; // 20
	
	void m1(){
		System.out.println(x); // 0
		x = 20;
		System.out.println(x); // 20
	}
	
	void m2(){
		x = 30; 
		System.out.println(x); //30
		x = x + 1;
		System.out.println(x); //31
	}
	
	void m3(){
		System.out.println(x); // 0
	}
	
	public static void main(String[] args){
		Example4 example4 = new Example4();
		example4.m1();
		example4.x = example4.x+20;
		example4.m3();
		example4.m2();
		example4.m3();
	}
}
// 0 20  20 30 31
// 0 20  0 30 31

/*0 20 40 30 31 31
0 20 40 30 31 40
0 20 20 30 31 20
0 20 40 30 31 30*/



