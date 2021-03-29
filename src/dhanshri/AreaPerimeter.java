package dhanshri;

public class AreaPerimeter{
 double pi = 3.1416;
 
 void circle(int radius){
  double areaOfCircle = pi*radius*radius;
  double perimeterOfCiircle = 2*pi*radius;

  System.out.println("Area of Circle is "+areaOfCircle);
  System.out.println("Perimeter of circle is "+perimeterOfCiircle);
 
}
 void rectangle(int lenght, int width){
  int areaofRectangle = lenght*width;
  int perimeterOfectangle = 2*lenght+2*width;
  System.out.println("Area of rectnagle is "+areaofRectangle);
  System.out.println("Perimeter of rectangle is "+perimeterOfectangle);
 }

 public static void main(String[] args){
	 AreaPerimeter areaPerimeter1 = new AreaPerimeter();
	 areaPerimeter1.circle(4);
	 areaPerimeter1.rectangle(2,3);
	 
 } 
}