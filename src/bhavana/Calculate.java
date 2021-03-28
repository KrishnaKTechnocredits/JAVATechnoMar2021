package bhavana;
class Calculate{
	void square(int a){
		int answer;
		answer=a*a;
		System.out.println("Square of a number is:"+answer);
	}
	
	void cube(int a){
		int answer;
		answer=a*a*a;
		System.out.println("Cube of the number is:"+answer);
	}

	public static void main(String [] args){
		Calculate cal= new Calculate();
		cal.square(15);
		cal.cube(5);
	}
}