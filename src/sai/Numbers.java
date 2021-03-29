package sai;

class Numbers{

	void square(int n){
		int res = n*n;
		System.out.println("Square of the number is " + res);
	}
	
	void cube(int m){
		int result = m*m*m;
		System.out.println("Cube of the number is " + result);
	}
	
	public static void main(String[] args){
		Numbers numbers = new Numbers();
		numbers.square(9);
		numbers.cube(11);
	}	
}