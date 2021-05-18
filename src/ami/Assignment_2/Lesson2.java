package ami.Assignment_2;
//find the square and cube of number

class Lesson2{
	
	void square(int x){
		int y = x * x;
		System.out.println("square :" + y);
	}

	void cube(int x){
		int y = x * x * x;
		System.out.println("cube :"+ y);
	}
	
	public static void main(String[] a){
		Lesson2 lesson2 = new Lesson2();
		lesson2.square(2);
		lesson2.cube(2);
	}
}
