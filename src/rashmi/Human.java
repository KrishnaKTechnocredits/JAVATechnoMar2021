package rashmi;
public class Human{
	String name;
	int age;
	boolean speak;
	
	void canSpeak(boolean hSpeak){
		speak = hSpeak;
	}
	
	void humanName(String hName){
		name = hName;
	}
	
	void humanAge(int hAge){
		age = hAge;
	}
	
	void showDetails(){
		System.out.println("Human name is " + name);
		System.out.println("Human age is " + age);
		System.out.println("Human can speak : " + speak);
	}
	
	public static void main(String[] args){
		Human human = new Human();
		human.canSpeak(true);
		human.humanName("Rita");
		human.humanAge(26);
		human.showDetails();
	}
}
	
	