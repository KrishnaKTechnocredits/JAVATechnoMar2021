package sourabh;

class Human{
	String name;
	boolean speak;
	int age;
	void humanName(String name1){
		name= name1;
	}
	void canSpeak(boolean flag){
		speak= flag;
	}
	void humanAge(int age1){
		age= age1;
	}
	void showDetails(){
		System.out.println("Name : "+name);
		System.out.println("Can Speak : "+speak);
		System.out.println("Age : "+age);
	} 
	public static void main(String[] args){
		Human human= new Human();
		human.humanName("Abhi");
		human.canSpeak(true);
		human.humanAge(24);
		human.showDetails();
	}
}