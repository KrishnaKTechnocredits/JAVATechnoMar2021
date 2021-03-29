/*Assignment-2 :WAP to find the square and cube of a number*/

package renuka;

class SquareCube{
  
  void findSquare(int num){
       System.out.println("Square of given number is: " + num*num);
  }
  
  void findCube(int num){
       System.out.println("Cube of given number is: " + num*num*num);
  }
  
  public static void main(String[] args){
       SquareCube findSquareCube = new SquareCube();
	   findSquareCube.findSquare(4);
	   findSquareCube.findCube(6);
  } 
}