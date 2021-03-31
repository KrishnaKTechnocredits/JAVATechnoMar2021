package bhushan;
class Calculator{
	int x=20,y=5;
	
	void add(){
		int answer = x+y;
		System.out.println("Addition of two var is: "+answer);
	}

    void sub(){
		int answer = x-y;
		System.out.println("Subtration of two var is: "+answer);
	}
		
	void mul(){
		int answer = x*y;
		System.out.println("multipliation of two var is: "+answer);
	}

	public static void main (String[] args){
		Calculator c1 = new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
	}
}