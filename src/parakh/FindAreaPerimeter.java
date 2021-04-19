package parakh;

public class FindAreaPerimeter{

      double pi = 3.14;
	  
	  void findAreaOfRectangle(int length, int width){
	       System.out.println("Area of Rectangle: " +length*width);
	  }
	  
	  void findPerimeterOfRectangle(int length, int width){
	       System.out.println("Perimeter of Rectangle: " +((2*length)+(2*width)));
	  }
	  
	  void findAreaOfCircle(int radius){
	       System.out.println("Area Of Circle: " +(pi*radius*radius));
	  }
	  
	  void findPerimeterOfCircle(int radius){
	       System.out.println("Perimeter Of Circle:" +(2*pi*radius));
	  }
	  
	  public static void main(String args[]){
	         FindAreaPerimeter FindAreaPerimeter = new FindAreaPerimeter();
			 FindAreaPerimeter.findAreaOfRectangle(4,8);
			 FindAreaPerimeter.findPerimeterOfRectangle(4,8);
			 FindAreaPerimeter.findPerimeterOfCircle(20);
			 FindAreaPerimeter.findAreaOfCircle(20);
			 }
}