package madhavi_Khasbage;

class PerimeterRecCircle
{
	void CalRectangleArea(float length,float width){
		float rectangleArea = length * width;
		System.out.println("Rectangle length  = " + length);
		System.out.println("Rectangle width  = " + width);		
		System.out.println("Rectangle area = " + rectangleArea);
		System.out.println("====================================");
		
	}
	void CalRectanglePerimeter(float length,float width){
		float rectanglePerimeter = 2*length + 2*width;
		System.out.println("Rectangle length  = " + length);
		System.out.println("Rectangle width  = " + width);		
		System.out.println("Rectangle perimeter = " + rectanglePerimeter);
		System.out.println("====================================");
		
		System.out.println("Math.PI  = " + Math.PI );
	}
	
	void CalCircleArea(double radius){
		double circleArea = Math.PI * radius * radius;
		System.out.println("Circle radius  = " + radius );		
		System.out.println("Circle area = " + circleArea);
		System.out.println("====================================");
	}
	void CalCirclePerimeter(double radius){
		double circlePerimeter = 2 *  Math.PI * radius;
		System.out.println("Circle radius  = " + radius);		
		System.out.println("Circle perimeter = " + circlePerimeter);
	}
	
	
	public static void main(String[] agrs){
		PerimeterRecCircle objPeriArea =new PerimeterRecCircle();
		objPeriArea.CalRectangleArea(4,5);	
		objPeriArea.CalRectanglePerimeter(9,10);	
		objPeriArea.CalCircleArea(8);	
		objPeriArea.CalCirclePerimeter(7);			
	}	
}