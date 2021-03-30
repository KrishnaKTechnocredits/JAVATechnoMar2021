package dipali;


public class Calculator{

	int x, y;
	
	
	void add(){
	
		int answer=x+y;
		System.out.println("addition is " +answer);
	
	}
	
	void sub(){
		int answer=x-y;
		System.out.println("substraction is "+answer);
	
	
	}

	void multiply(){
		int answer=x*y;
		System.out.println("multiplication is "+answer);
	
	
	}
	
		void div(){
		int answer=x/y;
		System.out.println("division is "+answer);
	
	
	}
	
	
	public static void main(String []args){
		Calculator cal=new Calculator();
		cal.x=20;
		cal.y=10;
		cal.add();
		cal.sub();
		cal.multiply();
		cal.div();
		
	
	}

}