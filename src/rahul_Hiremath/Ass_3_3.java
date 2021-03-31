package rahul_hiremath;

class Ass_3_3
{
	String name;
	boolean speak;
	int age;
	void humanName(String hName){
		name = hName;
	}
	void canSpeak(boolean hSpeak){
		speak = hSpeak;
	}
	void humanAge(int hAge){
		age = hAge;
	}
	void showDetails(){
		System.out.println("Name is: " + name);
		System.out.println("Can speak is: " + speak);
		System.out.println("Age is: " + age);
	}
	public static void main (String[] args){
		Ass_3_3 human = new Ass_3_3();
		human.humanName("Rahul Hiremath");
		human.canSpeak(true);
		human.humanAge(28);
		human.showDetails();
	}
}