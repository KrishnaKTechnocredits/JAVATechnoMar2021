package surabhi;
/*
 * 
 * Assignment num 2
 * */
class Example2{
	 double pi= 3.1416;

	void areaOfRectangle(int length , int width){
		int area= length * width;
		System.out.println("Area of a rectangle is :" +area);
	}
	void perimeterOfRectangle(int length , int width){
		int perimeter= 2*length + 2*width;
		System.out.println("Perimeter of a rectangle is :" +perimeter);
	}
		void areaOfCircle(double radius){
		//double pi= 3.1416;		   
		double area= pi*radius*radius;
		System.out.println("Area of a Circle is :" +area);
	}
	void perimeterOfCircle(double radius){
		//double pi= 3.1416;
		double perimeter= 2*pi*radius;
		System.out.println("Perimeter of a Circle is :" +perimeter)	;
	}
	
	public static void main(String args[]){	
		Example2 exm2=new Example2();
		exm2.areaOfRectangle(5, 6);
		exm2.perimeterOfRectangle(5, 6); 
		exm2.areaOfCircle(5.01); 
		exm2.perimeterOfCircle(5.01); 
	}

}