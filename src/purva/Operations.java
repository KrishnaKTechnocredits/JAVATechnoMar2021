/* 
 * Assignment 2 square and cube of number
 */
package purva;

 class Operations{
    void square(int x){
		int answer = x * x;
		System.out.println("Square of number is: "+ answer);
	}
	
	void cube(int y){
		int answer = y * y * y;
		System.out.println("Cube of the number is: "+answer);
	}
	
	public static void main(String[] args){
		Operations operations = new Operations();
		operations.square(5);
		operations.cube(5);
    }
}