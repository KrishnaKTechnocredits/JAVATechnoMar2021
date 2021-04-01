//Assigment 2- To find the area and perimeter of Rectangle & Circle. 

package radha;
class AreaPerimeter{
	void area1(int length, int width, int radius){
		int rectArea = (length*width);
		double circArea = (3.146*radius*radius);
		System.out.println("Area of Rectangle is: "+rectArea);
		System.out.println("Area of Circle is: "+circArea);
	}
	
	void perimeter2(int length, int width, int radius){
		int perimeterRect = 2*(length+width);
		double perimeterCircle = 2*3.146*radius;
		System.out.println("Perimeter of Rectangle is: "+perimeterRect);
		System.out.println("Perimeter of Circle is: "+perimeterCircle);
    }
	
	public static void main(String[] args){
		AreaPerimeter area_1 = new AreaPerimeter();
		area_1.area1(2,3,4);
		area_1.perimeter2(5,7,3);
	}
}
