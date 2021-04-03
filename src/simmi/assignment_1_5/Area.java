/*WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416*/

package simmi.assignment_1_5;

class Area
{
  void rectangle(float length, float breadth)
  {  
    float area = length * breadth;
	float perimeter = 2 * length + 2 * breadth;
	System.out.println("Area of rectangle is " + area);
	System.out.println("Perimeter of rectangle is " + perimeter);
  }
  void circle(float radius)
  {
	  double area1 = 3.14*radius*radius;
	  double perimeter1 = 2*3.14*radius;
	  System.out.println("Area of circle is " + area1);
	  System.out.println("Perimeter of circle is " + perimeter1);
  }
  public static void main(String[] args)
  {
    Area a = new Area();
	a.rectangle(3,4);
	a.circle(4);
  }
}