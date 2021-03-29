package kapil;

class Calculator{
    int x = 80;
    int y = 20;

    void add(){ 
	     int answer = x+y;
		 System.out.println("Addition =  "+answer);
	}

    void sub(){
		 int answer = x-y;
		 System.out.println("substracation =  "+answer);
	}
	void mul(){
	     int answer= x*y;
		 System.out.println("multiply = "+answer);
	}
	void div(){
		int answer= x/y;
		System.out.println("division = "+answer);
	}
	
	public static void main(String[] args)
	{
		Calculator cal= new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
	
}

  