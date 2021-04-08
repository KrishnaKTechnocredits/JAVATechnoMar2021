package surabhi.assignment1_5;
/*
 * 
 * Assignment num 1
 * */
class Calculator{
	int x=20;
	int y=5;
	
	void add(){
	int x1=x+y;
	System.out.println("Addition of two variables :" + x1);
	
	}

	void sub(){
	int x1=x-y;
	System.out.println("Substation of two variables :" +x1);
	}

	void mul(){
	int x1=x*y;
	System.out.println("Multiplication of two variables :" +x1);	
	}

	void div(){
	int x1=x/y;
	System.out.println("Division of two variables :" +x1);	
	}
	
	public static void main(String args[]){
	Calculator cal=new Calculator();
	cal.add();
	cal.sub();
	cal.mul();
	cal.div();
	
	}
}
