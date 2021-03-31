package milind;
/*WAP to find the area and perimeter of Rectangle & Circle. 
 *
 */
class Example4{
	float pi =3.1416f;
	float areaRectangle;
	float areaCircle;
	float perimeterRectangle;
	float perimeterCircle;
	void area(int num1,int num2){
		areaRectangle=num1*num2;
		areaCircle=pi*num1*num1;
		System.out.println("Area of Rectangle is: "+areaRectangle);
		System.out.println("Area of Circle is: "+areaCircle);
	}		
	void perimeter(int num1,int num2){
		perimeterRectangle=2*(num1+num2);
		perimeterCircle=2*pi*num1;
		System.out.println("Perimeter of Rectangle is: "+perimeterRectangle);
		System.out.println("Perimeter of Circle is: "+perimeterCircle);
	}
	public static void main(String[] args){
		Example4 rectangleCircle1 = new Example4();
		rectangleCircle1.area(5,10);
		rectangleCircle1.perimeter(5,10);
	}
}