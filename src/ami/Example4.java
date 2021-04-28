package ami;

class Example4{
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
		Example4 example4 = new Example4();
		example4.m1();
		example4.x = example4.x + 20; // we can not write in main method like this x=x+20 bcz we create object
		example4.m3();
		example4.m2();
	 
	 }
	
}

