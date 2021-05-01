package ami;

class Example4_1{
	int x=0;
	
	void m1(){
		System.out.println(x);
		x = 20; //uncanged value
		System.out.println(x);
	}
	
	void m2(){
		x = 30; // unchaned value // x instant value should be chnage when here not dislay int 
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		}
		
	void m3(){
		System.out.println(x);
	}
	 
	 public static void main(String[] a){
		Example4_1 example4_1 = new Example4_1();
		example4_1.m1();
		example4_1.x = example4_1.x + 20; // we can not write in main method like this x=x+20 bcz we create object
		example4_1.m3();
		example4_1.m2();
	 
	 }
	
}

