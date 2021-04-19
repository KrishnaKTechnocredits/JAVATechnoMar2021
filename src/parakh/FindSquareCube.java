package parakh;

public class FindSquareCube{
 
      void findSquare(int num){
	      System.out.println("Square of given number is: " +num*num);
	}
	void findCube(int num){
	      System.out.println("Cube of given number is: " +num*num*num);
    }
	
	public static void main(String args[]){
	      FindSquareCube findSquareCube = new FindSquareCube();
		  findSquareCube.findSquare(10);
		  findSquareCube.findCube(10);
	}
}