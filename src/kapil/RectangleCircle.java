package kapil;

class RectangleCircle{
	
	   double pi = 3.1416;

    void R1 (int l ,int b){
	     int ans = l*b;
		 System.out.println("Area of a rectangle = "+ans);
		 		
		}
		 
	void R1_1 (int l,int b){
		
		int ans = 2*l+2*b;
        System.out.println("Perimeter of a rectangle = "+ans);
		
	}
		 void C1(double r){
         double ans = pi*r*r;
		 System.out.println("Area of a circle = "+ans); 
		 }
		 
	   void C1_1 (double r){
	   double ans = 2*pi*r;
		System.out.println("Perimeter of  circle = "+ans);
		 }
	   
	public static void main (String[] args)	 
	{
	     RectangleCircle rectangleCircle1 = new RectangleCircle();
		 rectangleCircle1.R1(10,20);
		 rectangleCircle1.R1_1(10,20);
		 rectangleCircle1.C1(5);
		 rectangleCircle1.C1_1(5);
		 }
}