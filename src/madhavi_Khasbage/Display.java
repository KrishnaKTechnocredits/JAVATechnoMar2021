package madhavi_Khasbage;

public class Display {
	String name;
	
	void setName(String stdName){
		name=stdName;
	}
	
	void display(){
		System.out.println("Student name is" + name);
	}
	
	public static void main(String[] args) {
		Display display1=new Display();
		display1.setName("Welcome to Git");
		display1.display();
	}
}
