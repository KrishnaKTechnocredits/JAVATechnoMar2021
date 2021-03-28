//Assignment 3

package rupali;
class Human{
	String name;
	int age;
	boolean speak;
	
	void humanName(String n){
	    name=n;
	}
	
	void humanAge(int a){
		age=a;
	}
	void canSpeak(boolean s){
		speak=s;
	}
	
	void showDetails(){
		System.out.println("Name of human="+name);
		System.out.println("Age of "+name+" is"+age);
		System.out.println("This human can speak is :"+speak);
	}
	
	public static void main(String[] args){
	Human human=new Human();
	human.humanName("Akbar");
	human.humanAge(40);
	human.canSpeak(true);
	human.showDetails();
	}
}