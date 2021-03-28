package sourabh;

class AreaPerimeter{
	double pi= 3.14;
	
	void area(float length, float width, int r){
		float recarea = length*width;
		System.out.println("Area of a Rectangle is "+ recarea);
		
		double cirarea = pi*r*r;
		System.out.println("Area of a Circle is "+ cirarea);
	} 
	
	void perimeter(float length, float width, int r){
		float recperimeter=2*length + 2*width;
		System.out.println("Perimeter of a Rectangle is "+ recperimeter);
		
		double cirperimeter= 2*pi*r;
		System.out.println("Perimeter of a Circle is "+ cirperimeter);
		
	}
	
	public static void main(String[] args){
		AreaPerimeter areaperimeter= new AreaPerimeter();
		areaperimeter.area(5, 3, 7);
		areaperimeter.perimeter(4,3,5);		
	}

}