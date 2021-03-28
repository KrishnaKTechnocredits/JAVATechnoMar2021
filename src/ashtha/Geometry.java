package ashtha;

class AreaAndPerimeter {

	void area(int len1, int wid1, int r1){
		int squareArea = len1*wid1;
		double circleArea = 3.1416*r1*r1;
		System.out.println("Area of Square = "+squareArea);
		System.out.println("Area of circle = "+circleArea);
	}
	
	void perimeter(int len2, int wid2, int r2){
		int squarePerimeter = 2*len2 + 2*wid2;
		double circlePerimeter = 2*3.1416*r2;
		System.out.println("Perimeter of square = "+squarePerimeter);
		System.out.println("Perimeter of circle = "+circlePerimeter);
	}
	
	public static void main (String[] a) {
		AreaAndPerimeter areaAndPerimeter = new AreaAndPerimeter();
		areaAndPerimeter.area(2,4,3);
		areaAndPerimeter.perimeter(3,5,10);
	}
}