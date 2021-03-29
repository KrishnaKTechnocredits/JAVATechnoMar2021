package kapil;

class SquareCube{
    
 
    void Square1(int x){
		 int ans = x*x;
	     System.out.println("Square of a number is " +ans);
		 }
    void Cube1(int y){
		  int ans = y*y*y;
	     System.out.println("Cube of a number is " +ans);
		 }
		 
	public static void main(String[] args)
	{  
		 SquareCube squareCube2 = new SquareCube();
		 squareCube2.Square1(11);
		 squareCube2.Cube1(9);
		}
}