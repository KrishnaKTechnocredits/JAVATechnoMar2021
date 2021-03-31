package bhushan;
class Human{
	String humanName;
	boolean flag;
	int humanAge;
	void humanName(String hName){
		humanName = hName;
	}
	void canSpeak(boolean flg){
		flag = flg;
	}
	void humanAge(int hAge){
		humanAge = hAge;
	}
	void showDetails(){
		System.out.println("Human Name is: " +humanName+ "\nCan Speak: "+flag+ "\nAge is: "+humanAge);
	}
	public static void main(String[] args){
		Human human1 = new Human();
		human1.humanName("Bhushan");
		human1.canSpeak(true);
		human1.humanAge(30);
		human1.showDetails();
	}
}