package sourabh;

class Calculator{
	int x= 10;
	int y= 20;
	void add(){
		int answer= x+y;
		System.out.println("Add"+answer);
		}
	void sub(){
		int answer= y-x;
		System.out.println("Sub"+answer);
		}
	void mul(){
		int answer= x*y;
		System.out.println("Mul"+answer);
		}		
	
	void div(){
		int answer= y/x;
		System.out.println("Div"+answer);
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

