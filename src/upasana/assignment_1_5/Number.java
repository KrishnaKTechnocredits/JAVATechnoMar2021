package upasana.assignment_1_5;


class Number{
	
	void square(int x){
		System.out.println("Square of two numbers is "+x*x);
	}
	
	void cube(int y){
		System.out.println("Cube of two numbers is "+y*y*y);
	}
	
	public static void main(String[] args){
		Number number = new Number();
		number.square(5);
		number.cube(4);
	}
}