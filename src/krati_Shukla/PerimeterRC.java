// WAP to find the area and perimeter of Rectangle & Circle. 
// NOTE : one method to calculate area and another for perimeter.

package krati_Shukla;

class PerimeterRC
{
	void area (int r,int l,int w)
	{
		int a;
		double a1;
		a = l*w;
		a1 = 3.14*r*r;
		
		System.out.println("Area of the rectangle is " +a);
		System.out.println("Area of the circle is " +a1);
	}
	
	void perimeter (int r,int l,int w)
	{
		double p1;
		int p;
		
		p1 = 2*3.14*r;
		p = 2*l + 2*w;
		System.out.println("Perimeter of the rectangle is " +p);
		System.out.println("Perimeter of the circle is " +p1);
	}
	
	public static void main (String[] a)
	{
		PerimeterRC perimeterRC = new PerimeterRC();
		
		perimeterRC.area(3,5,2);
		perimeterRC.perimeter(3,5,2);
	}
}