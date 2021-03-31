package monali;

class Areaandperimeter{
	
	void area(int L,int W,int r){
		double area_rectangle = L*W;
		double area_circle =(double)(3.14*r*r);
	    System.out.println("area of Rectangle is" +area_rectangle);
	    System.out.println("area of Circle is" +area_circle);
	}
	
	void perimeter(int L,int W,int r){
		double perimeter_rectangle = 2*L*W;
		double perimeter_circle =(double)(2*3.14*r);
		System.out.println("perimeter of rectangle is" +perimeter_rectangle);
		System.out.println("perimeter of circle is" +perimeter_circle);
	}
	
	public static void main(String[] a){
		Areaandperimeter Areaandperimeter = new Areaandperimeter();
		Areaandperimeter.area(3,4,5);
		Areaandperimeter.perimeter(2,3,4);
	}
		
		
}
	
	