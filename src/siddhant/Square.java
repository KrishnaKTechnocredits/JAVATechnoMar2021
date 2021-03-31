package siddhant;

class Square{
	void squ(int num){
		int ans = num*num;
		System.out.println("Square is"+ans);
	}
	void cube(int num){
		int ans = num*num*num;
		System.out.println("Cube is "+ans);
	}
	public static void main(String[] args){
		Square square = new Square();
		square.squ(8);
		square.cube(8);
	}
}	
		
	