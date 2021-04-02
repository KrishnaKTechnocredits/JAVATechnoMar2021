package adwait;

class Calculate {
	
	void square(int i){
		int sq=i*i;
		System.out.println("Square of "+i+" is: "+sq);
	}
	
	void cube(int i){
		int cu = i*i*i;
		System.out.println("Cube of "+i+" is: "+cu);
	}
	
	public static void main (String [] args){
		Calculate calculate = new Calculate ();
		calculate.square(5);
		calculate.cube(7);
	}
} 