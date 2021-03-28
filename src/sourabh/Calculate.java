package sourabh;

class Calculate{

	void square(int n){
		int ans=n*n;
		System.out.println("Square: "+ans);
	}
	
	void cube(int n){
		int ans= n*n*n;
		System.out.println("Cube: "+ans);
	}
	
	public static void main(String[] args){
		Calculate calculate= new Calculate();
		calculate.square(2);
		calculate.cube(3);
	}

}