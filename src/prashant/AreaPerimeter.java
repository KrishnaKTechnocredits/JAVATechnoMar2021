package prashant;

//Assignment 2 : WAP to find the area and perimeter of Rectangle & Circle.

class AreaPerimeter {

	void rectangle(int l, int w) {
		int rect_perimeter = 2 * l + 2 * w;
		int rect_area = l * w;
		System.out.println("Area of rectangle whose lenght is 4 and Width is 3 :" + rect_area);
		System.out.println("Perimeter of rectangle  whose lenght is 4 and Width is 3 :" + rect_perimeter);
	}

	void circle(int r) {
		double cirarea = (double) 3.1416 * r * r;
		double cirperimeter = (double) 2 * 3.1416 * r;
		System.out.println("Perimeter of circle whose radius is 5 :" + cirperimeter);
		System.out.println("Area of circle whose radius is 5 :" + cirarea);
	}

	public static void main(String[] args) {
		AreaPerimeter arperi = new AreaPerimeter();
		arperi.rectangle(4, 3);
		arperi.circle(5);

	}
}