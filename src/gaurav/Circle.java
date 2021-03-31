package gaurav;

//Assignment 2

class Circle{

   void recentangle(int length,int width){
     int area = length*width;
	 int perimeter= 2*length + 2*width;
	 System.out.println("area of recentangle "+area);
    }	
	
   void circle(int r){
     double pi=3.1416;
	 int area = 2 * r* r ;
	 double perimeter = 2 * pi *r; 
	 System.out.println("area of circle is "+area);
	 System.out.println("perimeter of circle is "+perimeter);
	 }
	 public static void main(String[]args){
	 Circle circle1 = new Circle();
	 circle1.recentangle(6,6);
	 circle1.circle(4);
	 }
}
	 
        	
	 