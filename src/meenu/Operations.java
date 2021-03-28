package meenu;

/* Assignment_2 -> Program_1:WAP to find the square and cube of a number.
        NOTE : one method to calculate square and another for cube.
 */
 
class Operations{

	void square(int x){
        System.out.println("Square is "+x*x);
	}
	
	void cube(int x){
	    System.out.println("Cube is "+x*x*x);
	}
	
	public static void main(String[] args){
		Operations operations1 = new Operations();
		operations1.square(2);
		operations1.cube(4);
	}
}	 