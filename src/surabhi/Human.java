package surabhi;

/*
 * Assignment No 4
 * 
 * */
class Human{
	String humanName;
	boolean canSpeak;
	int humanAge;
	
	void humanName(String name){
		humanName=name;
	}
	void canSpeak(boolean speak){
		canSpeak=speak;
	}
	void humanAge(int age){
		humanAge=age;
	}
	void showDetails(){
		System.out.println("Human name is :" +humanName);
		System.out.println("Human is able to speak :" +canSpeak);
		System.out.println("Human Age is :" +humanAge);
	}
	
	public static void main(String[] args){
		Human human=new Human();
		human.humanName("Surabhi");
		human.canSpeak(true);
		human.humanAge(26);
		human.showDetails();	
	}

}