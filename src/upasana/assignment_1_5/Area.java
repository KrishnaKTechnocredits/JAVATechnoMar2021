package upasana.assignment_1_5;

class Area{
	
	void Rectangle(double l,double w){
		System.out.println("Area of rectangle is "+l*w);
		System.out.println("Perimeter of rectangle is "+2*(l+w));
	}
	
	void Circle(double r){
		double pi = 3.14;
		System.out.println("Area of circle is "+pi*r*r);
		System.out.println("Perimeter of circle is "+2*pi*r);
	}
	
	public static void main(String[] args){
		Area area = new Area();
		area.Rectangle(5,6);
		area.Circle(3);
	}
}