package simmi;

class Human{
	String name;
	int age;
	boolean canSpeak;
	
	void humanName(String h_name){
		name = h_name;
	}
	
	void canSpeak(boolean flag){
		canSpeak = flag;
	}
	
	void humanAge(int h_age){
		age = h_age;
	}
	
	void showDetails(){
		System.out.println(" Her name is : " + name);
		System.out.println(" She can speak : " + canSpeak);
		System.out.println(" Her age is : " + age);
	}
	
	public static void main(String[] args){
		Human h = new Human();
		h.humanName("Siarra");
		h.canSpeak(false);
		h.humanAge(1);
		h.showDetails();
	}
}