package pallavi.Assignment_3;

class Human{
	String name;
	int age;
	boolean speak;
	
	void humanName(String humanName){
		name=humanName;
	}
	
	void canSpeak(boolean flag){
		speak=flag;
	}
	
	void humanAge(int humanAge){
		age=humanAge;
	}
	
	void showDetails(){
	System.out.println("Name is = " +name);
	System.out.println("Age is = " +age);
	System.out.println("Can speak ? = "+speak);
	}
	
	public static void main(String args[]){
	Human human = new Human();
	human.humanName("Pallavi Raj");
	human.humanAge(25);
	human.canSpeak(true);
	
	}
}