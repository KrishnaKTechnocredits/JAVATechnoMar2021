// Write a method and return name of student who has that roll num

package amruta.returntypeExample;

public class Example1 {
	
	/*String m1() {
		String name = "Amruta";
		return name;
		//return "Amruta";  ----- This will also work
	}*/
	
	String printName(int rollnum){
		if(rollnum == 1) {
			System.out.println("Good Morning");
			return "Amruta";
		}else if(rollnum==9) 
			return "Priyanka";
		
		System.out.println("Hello...");
		System.out.println("World");
		return "Kajal";
		
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		String name = example1.printName(1);
	}
}
