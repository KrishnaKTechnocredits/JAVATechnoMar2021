//WAP to fine area and parameter of Rectangle and circle.
package ashwini;
class circleRectangle{

	int area1 ,parameter1 , length, width , redius;
	double pi = 3.14 , area2 , parameter2;
	
	void area( int len , int wid ,int red ){
		
		length = len;
		width = wid;
		area1 = len*wid;
		
		redius = red;
		area2 = pi*(red*red);
		
		System.out.println("Area of Rectangle is :"+ area1);
		System.out.println("Area of circle is :"+ area2);
	}
	
	 void parameter(int len , int wid , int red){
		
		length = len;
		width = wid;
		parameter1 = 2*(len+wid);
		
		redius = red;
		parameter2 = 2*pi*red;
		
		System.out.println("Parameter of Rectangle is :"+ parameter1);
		System.out.println("Parameter of circle is :"+ parameter2);
		
	}
		 
	public static void main(String args[]){
		circleRectangle circleRectangle1 = new circleRectangle();
		circleRectangle1.area(12, 10, 5);
		circleRectangle1.parameter(12,10,5);
	}
}