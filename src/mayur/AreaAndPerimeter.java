//2. WAP to find the area and perimeter of Rectangle & Circle.
//NOTE : one method to calculate area and another for perimeter.
//HINT :
//Rectangle area = length * width
//Rectangle perimeter = 2*Length + 2*Width
//Circle area = pi*r*r, where r is radius
//Circle perimeter = 2*pi*r , where pi = 3.1416

package mayur;
class AreaAndPerimeter
{
	void rectangle(int l,int b)
	{
		int area1=l*b;
		int perimeter1=2*l+2*b;
		System.out.println("length of rectangle is " +l);
		System.out.println("breadth of rectangle is " +b);
		System.out.println("area of rectangle is " +area1);
		System.out.println("perimeter of rectangle is " +perimeter1);
	}
	
	void circle(int r)
	{
		double pi=3.146;
		double area2= pi*r*r;
		double perimeter2=2*pi*r;
		System.out.println("radius of circle is " +r);
		System.out.println("area of circle is " +area2);
		System.out.println("perimeter of circle is " +perimeter2);
	}
	
	public static void main(String[] args)
	{
		AreaAndPerimeter areaAndPerimeter = new AreaAndPerimeter();
		areaAndPerimeter.rectangle(5,8);
		areaAndPerimeter.circle(8);
		
	}
}

	
