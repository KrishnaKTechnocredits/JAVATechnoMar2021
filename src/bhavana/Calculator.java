package bhavana;
class Calculator{

	int x=20;
	int y=5;
	void add(){
		int answer=x+y;
		System.out.println("The addition of two variable is:"+answer);
	}
	void subtraction(){
		int answer=x-y;
		System.out.println("The subtraction of two variable is:"+answer);
	}
	void multiplication(){
		int answer=x*y;
		System.out.println("The multiplication of two variable is:"+answer);
	}
	void division(){
		int answer=x/y;
		System.out.println("The division of two variable is:"+answer);
	}
	
	public static void main(String[] args){
		Calculator cal= new Calculator();
		cal.add();
		cal.subtraction();
		cal.multiplication();
		cal.division();
	}
}	