/*Assignment-2 :WAP to calcualte the rectangle and circle area,perimeter*/

package renuka;

class Calculate{
    
	void rectangle(int length, int width){
	     int rectangleArea = length*width;
		 int rectanglePerameter = 2*length + 2*width;
		 System.out.println("Rectangle Area is: "+ rectangleArea);
		 System.out.println("Rectangle Perameter is: "+ rectanglePerameter);
	}
	
	void circle(float pi, float r){
	     float circleArea = pi*r*r;
		 float circlePerameter = 2*pi*r;
		 System.out.println("Circle Area is: "+ circleArea);
		 System.out.println("Circle Perameter is: "+ circlePerameter);
	}

    public static void main(String[] args){
	     Calculate calculate = new Calculate();
         calculate.rectangle(8,8);
         calculate.circle(2.5f,3.5f);	 
	}
}