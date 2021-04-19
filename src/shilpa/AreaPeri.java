//WAP to find the area and perimeter of Rectangle & Circle
package shilpa;

class AreaPeri{
	int num1 = 10;
	int num2 = 5;
	double pi=3.1416;
	int r = 5;
	void area(){
		int arear = num1 * num2;
		double areac = pi*r*r;
		System.out.println("Area of Rectangle is: "+ arear);
		System.out.println("Area of Circle is: "+ areac);
	}
	void perimeter(){
		int perir = 2*num1+2*num2;
		double peric = 2*pi*r;
		System.out.println("Perimeter of Rectangle is: "+ perir);
		System.out.println("Perimeter of circle is : "+ peric);
	
	}
	public static void main(String[] arg){
		AreaPeri ap1 = new AreaPeri();
		ap1.area();
		ap1.perimeter();
		
	}
}