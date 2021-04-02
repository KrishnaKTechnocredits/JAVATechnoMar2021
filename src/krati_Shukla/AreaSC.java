//WAP to find the square and cube of a number. 
// NOTE : one method to calculate square and another for cube.
package krati_Shukla;

class AreaSC
{
	void square(int s)
	{
		int a;
		a = s*s;
		System.out.println ("Area of square is " +a);
	}
	
	void cube(int c)
	{
		int a;
		a = c*c*c;
		System.out.println ("Area of cube is " +a);
	}
	
	public static void main (String [] args)
	{
		
		AreaSC areaSC = new AreaSC();
		
		areaSC.square(5);
		areaSC.cube(4);
	}
}