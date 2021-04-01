package komal;

class Calculator{
	int x= 10;
	int y= 20;
	void add(){
		int answer= x+y;
		System.out.println("add "+answer);
		}
	void sub(){
		int answer = y-x;
		System.out.println("sub "+answer);
		}
	void div(){
		int answer = y/x;
		System.out.println("div "+answer);
		}
	void mul(){
		int answer = x*y;
		System.out.println("mul "+answer);
		}
	
	public static void main(String[] args)
	{
		Calculator cal= new Calculator();
		cal.add();
		cal.sub();
		cal.div();
		cal.mul();
	}
	}