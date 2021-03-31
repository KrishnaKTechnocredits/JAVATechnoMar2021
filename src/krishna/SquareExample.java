package krishna;
class SquareExample{
	int y;
		
	void square(int num){
		y=num*num;
		System.out.println("Square of given number:"+y);
	}
	void cube(int num){
		y=num*num*num;
		System.out.println("Cube of given number:"+y);
	}
	public static void main(String[] args){
		SquareExample squareExample = new SquareExample();
		squareExample.square(5);
		squareExample.cube(5);
	}
}