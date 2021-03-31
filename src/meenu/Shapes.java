package meenu;

/* Assignment_2 -> Program_2:WAP to find the area and perimeter of Rectangle & Circle. 
            NOTE : one method to calculate area and another for perimeter.
*/
class Shapes{
    double pi = 3.1416;

    void rectangleArea(int length, int breadth){
	    System.out.println("Area of Rectangle is "+length*breadth);
	}
	
	void recatanglePerimeter(int length, int breadth){
		System.out.println("Perimeter of Rectangle is "+(2*length+2*breadth));
	}

	void circleArea(int radius){
		System.out.println("Area of Circle is "+(pi*radius*radius));
	}

	void circlePerimeter(int radius){
		System.out.println("Perimeter of Circle is "+(2*pi*radius));
	}

    public static void main(String[] args){
		Shapes shapes1 = new Shapes();
		shapes1.rectangleArea(8,3);
		shapes1.recatanglePerimeter(8,3);
		shapes1.circleArea(7);
		shapes1.circlePerimeter(7);
	}
}	