package gaurav;

//WAP to find the area and perimeter of Rectangle & Circle. 
//Assignment 2

class Calculate2{

   void recetangle(int length,int width){
     int area = length*width;
	 int perimeter= 2*length + 2*width;
	 System.out.println("area of recentangle "+area);
	 System.out.println("perimeter of recetangle is "+perimeter);
    }	
	
   void circle(int r){
     double pi=3.1416;
	 int area = 2 * r* r ;
	 double perimeter = 2 * pi *r; 
	 System.out.println("area of circle is "+area);
	 System.out.println("perimeter of circle is "+perimeter);
	 }
	 public static void main(String[]args){
	 Calculate2 calculate = new Calculate2();
	 calculate.recetangle(6,6);
	 calculate.circle(4);
	 }
}
	 
        	
	 