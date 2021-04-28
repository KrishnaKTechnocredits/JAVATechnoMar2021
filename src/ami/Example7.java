package ami;

class Example7{
	int x = 10;
	static int y = 20;
	
	void m1(){
		x = x+1;
		y = y + 1;
		}
	
	void display(){
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		}
		
		public static void main(String[] a){
			Example7 example7_1 = new Example7();
			Example7 example7_2= new Example7();
			example7_1.m1();
			example7_1.m1();
			
			example7_2.m1();
			example7_1.display();
			example7_2.display();
			
	}
}