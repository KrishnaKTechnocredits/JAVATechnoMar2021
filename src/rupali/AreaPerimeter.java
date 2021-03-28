//Assignment 2

package rupali;

class AreaPerimeter
{
	void rectangle( int l, int w){
	
		System.out.println("Area of Rectangle is :"+ l*w);
		System.out.println("Perimeter of Rectangle is :"+2*( l+w));
	}
	
	void circle(int r){
		double pi=3.14;
		System.out.println("Area of Circle is :"+pi*r*r);
		System.out.println("Perimeter of circle int:"+2*pi*r);
	}
	
	public static void main(String[] args){
	
		AreaPerimeter areaperimeter = new AreaPerimeter();
		areaperimeter.rectangle(4,6);
		areaperimeter.circle(5);
	}
}