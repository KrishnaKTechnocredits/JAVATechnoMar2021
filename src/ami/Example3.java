package ami;

class Example3{
	int x=0;
	
	void m1(){
		System.out.println(x);
		int x = 20;
		System.out.println(x);
	}
	
	void m2(){
		int x = 30;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		}
		
	void m3(){
		System.out.println(x);
	}
	 
	 public static void main(String[] a){
		Example3 example3 = new Example3();
		example3.m1();
		example3.m3();
		example3.m2();
	 
	 }
	
}

