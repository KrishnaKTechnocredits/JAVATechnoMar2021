package simmi;

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